package com.chaitanya.springboot.k1.services.impl;

import com.chaitanya.springboot.k1.entities.User;
import com.chaitanya.springboot.k1.exceptions.ResourceNotFoundException;
import com.chaitanya.springboot.k1.payloads.UserDto;
import com.chaitanya.springboot.k1.repositories.UserRepo;
import com.chaitanya.springboot.k1.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToUser(userDto);
        User savedUser = this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        user.setName(userDto.getName()==null?user.getName():userDto.getName());
        user.setEmail(userDto.getEmail()==null?user.getEmail():userDto.getEmail());
        user.setPassword(userDto.getPassword()==null?user.getPassword():userDto.getPassword());
        user.setAbout(userDto.getAbout()==null?user.getAbout():userDto.getAbout());
        User updatedUser = this.userRepo.save(user);
        return this.userToDto(updatedUser);
    }

    @Override
    public UserDto getUserById(Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User" , "Id", userId));
        return this.userToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = this.userRepo.findAll();
        List<UserDto> userDtos = users.stream().map(user->userToDto(user)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
        this.userRepo.delete(user);
    }

    private User dtoToUser(UserDto userDto){
        User user = this.modelMapper.map(userDto, User.class);

//        User user = new User();
//        user.setId(userDto.getId());
//        user.setName(userDto.getName());
//        user.setEmail(userDto.getEmail());
//        user.setPassword(userDto.getPassword());
//        user.setAbout(userDto.getAbout());
        return user;
    }

    private UserDto userToDto(User user){
        UserDto userDto = this.modelMapper.map(user ,UserDto.class);
//        UserDto userDto = new UserDto();
//        userDto.setAbout(user.getAbout());
//        userDto.setEmail(user.getEmail());
//        userDto.setId(user.getId());
//        userDto.setPassword(user.getPassword());
//        userDto.setName(user.getName());
        return userDto;
    }
}

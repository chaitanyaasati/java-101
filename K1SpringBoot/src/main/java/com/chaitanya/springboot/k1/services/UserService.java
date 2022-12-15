package com.chaitanya.springboot.k1.services;

import com.chaitanya.springboot.k1.entities.User;
import com.chaitanya.springboot.k1.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto registerNewUser(UserDto user);
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer id);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}

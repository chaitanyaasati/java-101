package com.chaitanya.springboot.k1.security;

import com.chaitanya.springboot.k1.entities.User;
import com.chaitanya.springboot.k1.exceptions.ResourceNotFoundException;
import com.chaitanya.springboot.k1.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //loading user from database
        User user = this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User ", "email "+username, 0));
        return user;
    }
}

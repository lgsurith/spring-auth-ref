package com.jwt.authapi.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jwt.authapi.model.User;
import com.jwt.authapi.repository.UserRepository;

@Service
public class Userservice {
    private final UserRepository userRepository;

    public Userservice(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> allUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }
}

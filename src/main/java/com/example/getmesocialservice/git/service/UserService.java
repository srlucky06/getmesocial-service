package com.example.getmesocialservice.git.service;

import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 @Autowired
 private UserRepository userRepository;
 public User getUser(){
     return userRepository.getUser();

    }
}

package com.example.getmesocialservice.git.service;

import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);

    }
    public void deleteUser(String userId){
         userRepository.deleteById(userId);
    }

   public List<User> getByAddress(String address) {
         return userRepository.findAllByAddress(address);

    }


}

package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return  userService.saveUser(user);

   }



}
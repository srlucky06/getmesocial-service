package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return  userService.saveUser(user);

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/find")
    public List<User> getByAddress(@RequestParam(name="address") String address) {
        return userService.getByAddress(address);
    }
    @PutMapping
    public User updateUser( @RequestBody User user) {
        return userService.updateUser(user);

    }
    @DeleteMapping
    public void deleteUser(@RequestParam(name="userId") String userId) {
        userService.deleteUser(userId);
    }


}
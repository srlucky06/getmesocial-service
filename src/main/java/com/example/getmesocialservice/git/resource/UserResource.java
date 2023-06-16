package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.exception.RestrictedInfoException;
import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public User saveUser(@RequestBody @Valid User user) {
        return  userService.saveUser(user);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/find")
    public List<User> getUserById(@RequestParam("address") String address) throws RestrictedInfoException {
        if (address.equalsIgnoreCase("area51")) {
            throw new RestrictedInfoException();
        }
        return userService.getByAddress(address);
    }
    @GetMapping("/find-by-name")
    public List<User> getByName(@RequestParam("name") String name) throws RestrictedInfoException {
        if (name.equalsIgnoreCase("root")) {
            throw new RestrictedInfoException();
        }
        return userService.getByName(name);

    }

    @GetMapping("/find-by-id")
    public User getById(@RequestParam("id") String id) {
        return userService.getById(id);
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
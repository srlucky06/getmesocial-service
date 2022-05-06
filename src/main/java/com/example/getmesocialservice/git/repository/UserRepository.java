package com.example.getmesocialservice.git.repository;

import com.example.getmesocialservice.git.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
    public User getUser() {
        User user = new User( "Smith",  "Canada",  25,  "https://www.facebook.com/photo/?fbid=10220055581075910&set=a.1133702978856");
        return user;
    }

}

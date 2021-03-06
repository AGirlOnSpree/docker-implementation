package com.learn.myApplication.controller;

import com.learn.myApplication.model.UserDetails;
import com.learn.myApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserDetails> getUsers() {
        return userService.getAllUsers();
    }
}

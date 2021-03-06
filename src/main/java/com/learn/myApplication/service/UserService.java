package com.learn.myApplication.service;

import com.learn.myApplication.model.UserDetails;
import com.learn.myApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(UserDetails user) {
        userRepository.save(user);
    }

    public List<UserDetails> getAllUsers() {
        List<UserDetails> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}

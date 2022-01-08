package com.learn.myApplication;

import com.learn.myApplication.model.UserDetails;
import com.learn.myApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new UserDetails("Vinita", 27));
        userRepository.save(new UserDetails("Anoop", 29));
    }
}

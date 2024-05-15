package com.shcoolmanagement.shcoolmanagement.service;

import com.shcoolmanagement.shcoolmanagement.model.User;
import com.shcoolmanagement.shcoolmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Add the Service annotation to declare it as a Spring service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveuser (User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAlluser () {
        return userRepository.findAll();
    }
}

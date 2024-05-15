package com.shcoolmanagement.shcoolmanagement.service;

import com.shcoolmanagement.shcoolmanagement.model.User;

import java.util.List;

public interface UserService {
    public User saveuser (User user );
    public List<User> getAlluser ();
}

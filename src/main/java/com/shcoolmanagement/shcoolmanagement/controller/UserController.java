package com.shcoolmanagement.shcoolmanagement.controller;

import com.shcoolmanagement.shcoolmanagement.model.User;
import com.shcoolmanagement.shcoolmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    private UserService userService;
@PostMapping("/add")
    public String add(@RequestBody User user){
    userService.saveuser(user);
    return "New user Added";
}
@GetMapping("/getAll")
    public List<User> getAlluser(){
    return userService.getAlluser();
}
}

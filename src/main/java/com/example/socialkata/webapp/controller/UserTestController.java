package com.example.socialkata.webapp.controller;

import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.service.impl.model.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/")
public class UserTestController {

    private UserServiceImpl userService;

    public UserTestController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/usersList")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") long id) {
        Optional<User> user = userService.getById(id);
        return user;
    }
}

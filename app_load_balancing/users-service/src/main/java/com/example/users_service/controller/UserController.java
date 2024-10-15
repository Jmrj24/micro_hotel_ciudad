package com.example.users_service.controller;

import com.example.users_service.dto.UserDTO;
import com.example.users_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userServ;

    @GetMapping("/post/{userId}")
    public UserDTO getUserAndPosts(@PathVariable Long userId) {
        return userServ.getUserAndPosts(userId);
    }
}

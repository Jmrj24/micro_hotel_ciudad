package com.example.users_service.service;

import com.example.users_service.dto.UserDTO;
import com.example.users_service.model.User;


public interface IUserService {
    public UserDTO getUserAndPosts(Long userId);

    public User getUserById(Long userId);
}

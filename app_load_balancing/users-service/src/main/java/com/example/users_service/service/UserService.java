package com.example.users_service.service;

import com.example.users_service.dto.UserDTO;
import com.example.users_service.model.User;
import com.example.users_service.repository.IPostAPI;
import com.example.users_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepo;

    @Autowired
    private IPostAPI postApi;

    @Override
    public UserDTO getUserAndPosts(Long userId) {
        User userBd = this.getUserById(userId);
        UserDTO userPostDTO = new UserDTO();

        userPostDTO.setUser_id(userBd.getUser_id());
        userPostDTO.setName(userBd.getName());
        userPostDTO.setLastname(userBd.getLastname());
        userPostDTO.setCellphone(userBd.getCellphone());
        userPostDTO.setListPosts(postApi.getPostsByUserId(userId));

        return userPostDTO;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }
}

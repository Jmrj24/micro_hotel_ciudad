package com.example.posts_service.controller;

import com.example.posts_service.model.Post;
import com.example.posts_service.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private IPostService postServ;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Long userId) {
        System.out.println("---------Estoy en el puerto: "+ serverPort);
        return postServ.getPostsByUserId(userId);
    }
}

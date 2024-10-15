package com.example.posts_service.service;

import com.example.posts_service.model.Post;

import java.util.List;

public interface IPostService {
    public List<Post> getPostsByUserId(Long userId);
}

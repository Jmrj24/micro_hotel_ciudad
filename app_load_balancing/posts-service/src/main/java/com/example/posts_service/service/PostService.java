package com.example.posts_service.service;

import com.example.posts_service.model.Post;
import com.example.posts_service.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository postRepo;

    @Override
    public List<Post> getPostsByUserId(Long userId) {
        return postRepo.findPostByUserId(userId);
    }
}

package com.example.users_service.repository;

import com.example.users_service.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="posts-service")
public interface IPostAPI {

    @GetMapping("/post/{userId}")
    public List<PostDTO> getPostsByUserId(@PathVariable Long userId);
}

package com.example.posts_service.repository;

import com.example.posts_service.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p WHERE :userId=p.user_id")
    List<Post> findPostByUserId(Long userId);
}

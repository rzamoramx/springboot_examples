package com.ivansoft.springboot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ivansoft.springboot.example.models.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Iterable<Post> findByUserBlogId(Long id);
}

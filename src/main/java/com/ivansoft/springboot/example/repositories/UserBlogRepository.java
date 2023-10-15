package com.ivansoft.springboot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ivansoft.springboot.example.models.UserBlog;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBlogRepository extends JpaRepository<UserBlog, Long> {
}

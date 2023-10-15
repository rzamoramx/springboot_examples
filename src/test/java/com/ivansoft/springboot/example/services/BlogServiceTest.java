package com.ivansoft.springboot.example.services;

import com.ivansoft.springboot.example.models.UserBlog;
import com.ivansoft.springboot.example.repositories.PostRepository;
import com.ivansoft.springboot.example.repositories.UserBlogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BlogServiceTest {
    @Autowired
    private UserBlogRepository userBlogRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private TestEntityManager entityManager;

    private BlogService blogService;

    @BeforeEach
    void setUp() {
        blogService = new BlogService(userBlogRepository, postRepository);
    }

    @Test
    void createUser() {
        UserBlog userBlog = new UserBlog();
        userBlog.setEmail("jhon@email.com");

        UserBlog userBlogSaved = blogService.createUser(userBlog);

        UserBlog retrievedUserBlog = entityManager.find(UserBlog.class, userBlogSaved.getId());

        assertEquals(userBlog, retrievedUserBlog);
    }

    @Test
    void createPost() {
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void getAllPosts() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void getPostById() {
    }

    @Test
    void getPostsByUserId() {
    }
}
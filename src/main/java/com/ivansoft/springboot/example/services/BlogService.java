package com.ivansoft.springboot.example.services;

import org.springframework.stereotype.Service;
import com.ivansoft.springboot.example.models.Post;
import com.ivansoft.springboot.example.repositories.PostRepository;
import com.ivansoft.springboot.example.models.UserBlog;
import com.ivansoft.springboot.example.repositories.UserBlogRepository;

@Service
public class BlogService {
    private final UserBlogRepository userBlogRepository;
    private final PostRepository postRepository;

    public BlogService(UserBlogRepository userBlogRepository, PostRepository postRepository) {
        this.userBlogRepository = userBlogRepository;
        this.postRepository = postRepository;
    }

    public UserBlog createUser(UserBlog userBlog) {
        return userBlogRepository.save(userBlog);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Iterable<UserBlog> getAllUsers() {
        return userBlogRepository.findAll();
    }

    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public UserBlog getUserById(Long id) {
        return userBlogRepository.findById(id).orElse(null);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Iterable<Post> getPostsByUserId(Long id) {
        return postRepository.findByUserBlogId(id);
    }
}

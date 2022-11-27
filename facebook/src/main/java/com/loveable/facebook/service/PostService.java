package com.loveable.facebook.service;

import com.loveable.facebook.entities.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    Post getPost(Long id);

    void updatePost(Post updatePost);

    void deletePost(Long id);
}
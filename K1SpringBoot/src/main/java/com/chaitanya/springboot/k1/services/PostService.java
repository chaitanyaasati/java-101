package com.chaitanya.springboot.k1.services;

import com.chaitanya.springboot.k1.entities.Post;
import com.chaitanya.springboot.k1.payloads.PostDto;

import java.util.List;

public interface PostService {
    Post createPost(PostDto postDto, Integer userId, Integer categoryid);
    Post updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    List<Post> getAllPosts();
    Post getPostById(Integer postId);
    List<Post> getPostsByCategory(Integer categoryId);
    List<Post> getPostsByUser(Integer userid);
    List<Post> searchPosts(String keyword);
}

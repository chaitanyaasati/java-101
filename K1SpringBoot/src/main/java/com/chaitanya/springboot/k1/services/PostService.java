package com.chaitanya.springboot.k1.services;

import com.chaitanya.springboot.k1.entities.Post;
import com.chaitanya.springboot.k1.payloads.PostDto;
import com.chaitanya.springboot.k1.payloads.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryid);
    PostDto updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
//    List<PostDto> getAllPosts();
    PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
    PostDto getPostById(Integer postId);
    List<PostDto> getPostsByCategory(Integer categoryId);
    List<PostDto> getPostsByUser(Integer userid);
    List<PostDto> searchPosts(String keyword);
}

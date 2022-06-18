package com.chaitanya.springboot.k1.services.impl;

import com.chaitanya.springboot.k1.entities.Category;
import com.chaitanya.springboot.k1.entities.Post;
import com.chaitanya.springboot.k1.entities.User;
import com.chaitanya.springboot.k1.exceptions.ResourceNotFoundException;
import com.chaitanya.springboot.k1.payloads.PostDto;
import com.chaitanya.springboot.k1.repositories.CategoryRepo;
import com.chaitanya.springboot.k1.repositories.PostRepo;
import com.chaitanya.springboot.k1.repositories.UserRepo;
import com.chaitanya.springboot.k1.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Post createPost(PostDto postDto, Integer userId, Integer categoryId) {
        User user  = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "userId", userId));
        Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "category", categoryId));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.png");
        post.setAddedDate(new Date());
        post.setCategory(category);
        post.setUser(user);
        Post newPost = this. postRepo.save(post);
        return this.modelMapper.map(newPost, Post.class);
    }

    @Override
    public Post updatePost(PostDto postDto, Integer postId) {

        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> getAllPosts() {
        return null;
    }

    @Override
    public Post getPostById(Integer postId) {
        return null;
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId) {
        return null;
    }

    @Override
    public List<Post> getPostsByUser(Integer userid) {
        return null;
    }

    @Override
    public List<Post> searchPosts(String keyword) {
        return null;
    }
}

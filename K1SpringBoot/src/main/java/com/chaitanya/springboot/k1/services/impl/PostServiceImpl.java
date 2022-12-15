package com.chaitanya.springboot.k1.services.impl;

import com.chaitanya.springboot.k1.entities.Category;
import com.chaitanya.springboot.k1.entities.Post;
import com.chaitanya.springboot.k1.entities.User;
import com.chaitanya.springboot.k1.exceptions.ResourceNotFoundException;
import com.chaitanya.springboot.k1.payloads.PostDto;
import com.chaitanya.springboot.k1.payloads.PostResponse;
import com.chaitanya.springboot.k1.repositories.CategoryRepo;
import com.chaitanya.springboot.k1.repositories.PostRepo;
import com.chaitanya.springboot.k1.repositories.UserRepo;
import com.chaitanya.springboot.k1.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
        User user  = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "userId", userId));
        Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "category", categoryId));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.png");
        post.setAddedDate(new Date());
        post.setCategory(category);
        post.setUser(user);
        Post newPost = this. postRepo.save(post);
        return this.modelMapper.map(newPost, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","PostId",postId));
        post.setContent(postDto.getContent());
        post.setTitle(postDto.getTitle());
        //post.setImageName(postDto.getImageName());
        post = this.postRepo.save(post);
        return this.modelMapper.map(post, PostDto.class);
    }

    @Override
    public void deletePost(Integer postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","PostId",postId));
        this.postRepo.delete(post);
    }

    @Override
    public PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir) {
        Sort sort = null;
        if(sortDir.equalsIgnoreCase("asc")){
            sort = Sort.by(sortBy).ascending();
        }
        else{
            sort = Sort.by(sortBy).descending();
        }
        PageRequest p = PageRequest.of(pageNumber, pageSize, sort);
        Page<Post> pagePost = this.postRepo.findAll(p);
        List<Post> allPosts = pagePost.getContent();

//        List<Post> posts = this.postRepo.findAll(p);
        List<PostDto> postDtos = allPosts.stream().map((post)->this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNumber(pagePost.getNumber());
        postResponse.setPageSize(pagePost.getSize());
        postResponse.setTotalElements(pagePost.getTotalElements());
        postResponse.setTotalPages(pagePost.getTotalPages());
        postResponse.setLastPage(pagePost.isLast());
        return postResponse;
    }

    @Override
    public PostDto getPostById(Integer postId) {
        this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "PostId", postId));
        PostDto postDto = this.modelMapper.map(this.postRepo.findById(postId), PostDto.class);
        return postDto;
    }

    @Override
    public List<PostDto> getPostsByCategory(Integer categoryId) {
        Category cate = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","CategoryId",categoryId));
        List<Post> posts = this.postRepo.findByCategory(cate);
        List<PostDto> postsDto =  posts.stream().map((post)->this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        return postsDto;
    }

    @Override
    public List<PostDto> getPostsByUser(Integer userid) {
        User user = this.userRepo.findById(userid).orElseThrow(()->new ResourceNotFoundException("User", "UserId", userid));
        List<Post>  posts = this.postRepo.findByUser(user);
        List<PostDto> postsDto = posts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
        return postsDto;
    }

    @Override
    public List<PostDto> searchPosts(String keyword) {
        List<Post> posts = this.postRepo.searchByTitle("%"+keyword+"%");
        List<PostDto> postDtos = posts.stream().map((post)->this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        return postDtos;
    }
}

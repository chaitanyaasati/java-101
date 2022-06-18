package com.chaitanya.springboot.k1.controllers;

import com.chaitanya.springboot.k1.payloads.PostDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){

    }
}

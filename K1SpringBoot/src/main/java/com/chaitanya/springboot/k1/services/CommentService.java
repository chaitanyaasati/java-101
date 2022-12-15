package com.chaitanya.springboot.k1.services;

import com.chaitanya.springboot.k1.entities.Comment;
import com.chaitanya.springboot.k1.payloads.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}

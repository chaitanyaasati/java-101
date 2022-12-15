package com.chaitanya.springboot.k1.repositories;

import com.chaitanya.springboot.k1.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

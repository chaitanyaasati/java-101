package com.chaitanya.springboot.k1.repositories;

import com.chaitanya.springboot.k1.entities.Category;
import com.chaitanya.springboot.k1.entities.Post;
import com.chaitanya.springboot.k1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}

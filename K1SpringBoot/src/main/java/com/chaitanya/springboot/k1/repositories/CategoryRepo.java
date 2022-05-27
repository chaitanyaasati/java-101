package com.chaitanya.springboot.k1.repositories;

import com.chaitanya.springboot.k1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}

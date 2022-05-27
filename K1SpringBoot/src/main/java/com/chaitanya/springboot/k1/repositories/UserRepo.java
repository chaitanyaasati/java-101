package com.chaitanya.springboot.k1.repositories;

import com.chaitanya.springboot.k1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}

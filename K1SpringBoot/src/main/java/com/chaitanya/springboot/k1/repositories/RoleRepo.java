package com.chaitanya.springboot.k1.repositories;

import com.chaitanya.springboot.k1.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}

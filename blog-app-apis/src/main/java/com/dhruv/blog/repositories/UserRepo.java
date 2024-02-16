package com.dhruv.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhruv.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

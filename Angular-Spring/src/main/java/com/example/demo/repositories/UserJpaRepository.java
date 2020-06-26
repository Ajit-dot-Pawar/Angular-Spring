package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserJpaRepository  extends JpaRepository<User, Long>{

}

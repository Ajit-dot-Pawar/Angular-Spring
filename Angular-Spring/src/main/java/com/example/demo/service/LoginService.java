package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserJpaRepository;

@Service
public class LoginService {

	@Autowired
	private UserJpaRepository jpaRepo;
}

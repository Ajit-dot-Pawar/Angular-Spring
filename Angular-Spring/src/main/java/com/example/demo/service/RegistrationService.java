package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserJpaRepository;

@Service
public class RegistrationService {

	@Autowired
	private UserJpaRepository jpaRepo;
	
	public User saveUser(User user) {
		User userObj = null;
		userObj=jpaRepo.save(user);
		return userObj;
	}
}

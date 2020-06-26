package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@RequestMapping("/save")
	public User saveUser() {
		User userObj = null;
		User user = new User();
		
		user.setEmail("ajitpawar.ab@gmail.com");
		user.setUsername("Ajit_Pawar");
		user.setPassword("AjitPawar12345");
		
		userObj = service.saveUser(user);
		return userObj;
	}
	
}

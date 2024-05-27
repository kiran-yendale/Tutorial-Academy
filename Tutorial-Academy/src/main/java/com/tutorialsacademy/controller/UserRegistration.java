package com.tutorialsacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialsacademy.dto.UserDetailsDto;
import com.tutorialsacademy.service.UserRegisterService;

@RestController
public class UserRegistration {
	
	@Autowired
	UserRegisterService userRegistrationService;

	
	@PostMapping("/register")
	@CrossOrigin(origins = "*")
	public String register(@RequestBody UserDetailsDto userDetails) {
		
	return	userRegistrationService.userRegistration(userDetails);
		
	}
}

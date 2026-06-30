package com.fitness.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.service.Userservice;

@RestController
@RequestMapping("api/user")
public class UserController {

	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Userservice userService;
	@PostMapping("/register")
	public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request)
	{
		return ResponseEntity.ok(userService.register(request));
	}
	
	
	

}

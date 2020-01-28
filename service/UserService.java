package com.example.userexample.service;

import java.util.List;
import java.util.Optional;

import com.example.userexample.entity.UserDetails;

public interface UserService {

	public List<UserDetails> getUserDetails();
	
	public Optional<UserDetails> getUserById();
	
	
	
}

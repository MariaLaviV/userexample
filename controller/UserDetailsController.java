package com.example.userexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userexample.dto.UserDetailsMetaData;
import com.example.userexample.entity.UserDetails;
import com.example.userexample.repository.UserDetailsRepository;
import com.example.userexample.util.Response;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@PostMapping("/userDetails/submitUserDetails")
	public ResponseEntity<Response<String>> submitUserDetails(
			@RequestBody UserDetailsMetaData userDetailsMetaData) {
		UserDetails id=userDetailsRepository.save(userDetailsMetaData);
		
		Response<String> response = new Response<>();
		response.setOutput("User Created");
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/userDetails/loadUserDetails/{userId}")
	public ResponseEntity<Response<UserDetailsMetaData>> loadUserDetails(@PathVariable Integer userId){
		UserDetailsMetaData userDetailsMetaData=userDetailsRepository.find(userId);
		
		//UserDetailsMetaData u1=new UserDetailsMetaData();
		
		Response<UserDetailsMetaData> response = new Response<>();
		response.setOutput(userDetailsMetaData);
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/userDetails/findAllUser")
	public ResponseEntity<Response<UserDetails>> findAllUser(){
		List<UserDetails> userDetails=userDetailsRepository.findAll();
		
		Response<UserDetails> response = new Response<>();
		response.setOutput((UserDetails) userDetails);
		return ResponseEntity.ok().body(response);
	}
	/*@PutMapping("/userDetails/updateUserDetails/{userId}")
	public ResponseEntity<Response<String>> updateUserDetails(
			@RequestBody UserDetailsMetaData userDetailsMetaData, @PathVariable Integer userId)throws Exception{
		
		Optional<UserDetails> user =  userDetailsRepository.findById(userId);
		if (!user.isPresent())
			throw new Exception("Could not find employee with id- " + userId);
		
		if(userDetailsMetaData.getFirstName() == null || userDetailsMetaData.getFirstName().isEmpty())
			userDetailsMetaData.setFirstName(user.get().getFirstName());
		if(userDetailsMetaData.getLastName() == null || userDetailsMetaData.getLastName().isEmpty())
			userDetailsMetaData.setLastName(user.get().getLastName());
		if(userDetailsMetaData.getPosition() == null || userDetailsMetaData.getPosition().isEmpty())
			userDetailsMetaData.setPosition(user.get().getPosition());
		if(userDetailsMetaData.getOrganizationName() == null || userDetailsMetaData.getOrganizationName().isEmpty() )
			userDetailsMetaData.setOrganizationName(user.get().getOrganizationName());
		if(userDetailsMetaData.getDepartment() == null || userDetailsMetaData.getDepartment().isEmpty() )
			userDetailsMetaData.setDepartment(user.get().getDepartment());
		//if(userDetailsMetaData.getTelephone() == null || userDetailsMetaData.getTelephone().)
			//userDetailsMetaData.setTelephone(user.get().getTelephone());
		if(userDetailsMetaData.getCountry() == null || userDetailsMetaData.getCountry().isEmpty() )
			userDetailsMetaData.setCountry(user.get().getCountry());
		//if(userDetailsMetaData.getPostCode() == null || userDetailsMetaData.getPostCode(). )
			//userDetailsMetaData.setPosition(user.get().getPostCode());
		if(userDetailsMetaData.getEmailAddress() == null || userDetailsMetaData.getEmailAddress().isEmpty() )
			userDetailsMetaData.setEmailAddress(user.get().getEmailAddress());
		if(userDetailsMetaData.getPassword() == null || userDetailsMetaData.getPassword().isEmpty() )
			userDetailsMetaData.setPassword(user.get().getPassword());
		//if(userDetailsMetaData.getOtp() == null || userDetailsMetaData.getOtp(). )
			//userDetailsMetaData.setOtp(user.get().getOtp());
		
		Response<String> response = new Response<>();
		response.setOutput("UserDetails Updated");
		return ResponseEntity.ok().body(response);
	}*/
}

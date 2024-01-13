package com.mobileapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.model.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getAllUsers(@RequestParam(value="page") int page, @RequestParam(value="limit", required = false, defaultValue = "50") int limit) {
		return "get users was called with page = "+page +" and limit = "+limit;
	}
	
//	@GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
//	public UserRest getOneUser(@PathVariable String userId) {
//		UserRest userRest = new UserRest();
//		userRest.setUserId("1");
//		userRest.setFirstName("Swapnil");
//		userRest.setLastName("Mane");
//		userRest.setEmail("swapnil@gmail.com");
//		return userRest;
//	}
	
	@GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UserRest> getOneUser(@PathVariable String userId) {
		UserRest userRest = new UserRest();
		userRest.setUserId("1");
		userRest.setFirstName("Swapnil");
		userRest.setLastName("Mane");
		userRest.setEmail("swapnil@gmail.com");
		return new ResponseEntity<UserRest>(userRest, HttpStatus.OK);
	}
	
	@PostMapping
	public String crateUser() {
		return "created user was called";
	}
	
}

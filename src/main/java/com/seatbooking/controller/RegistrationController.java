package com.seatbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.model.User;
import com.seatbooking.services.RegistrationService;

@RestController
@RequestMapping("/web")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	
	@PutMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getUserEmail();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userobj = service.fetchUserByEmailId(tempEmailId);
			if(userobj != null) {
				throw new Exception("user with"+tempEmailId+"is already exist");
			}
		}
		User userobj = null;
		userobj = service.registerUser(user);
		return userobj;
		
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getUserEmail();
		String tempPass = user.getUserPassword();
		User userobj = null;
		if(tempEmailId != null && tempPass != null) {
			userobj  = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userobj == null) {
			throw new Exception("Bad credentials");
		}
		return userobj;
	}
	
	
}

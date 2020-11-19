package com.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.model.Booking;
import com.seatbooking.model.User;
import com.seatbooking.services.UserService;

@RestController
@RequestMapping("/web")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService userservice;
	 
	 
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userservice.getAllUser();
		
	}
	
	 @GetMapping("/booking/{userId}")
	public Booking getBooking(@PathVariable int userId){
		 System.out.println(userId);
		return userservice.getBookingByUserId(userId);
	}
	
	 //deny user
	 @GetMapping("/users/afterDelete/{userId}")
	 public List<User> deleteUser(@PathVariable int userId) { 
			userservice.deleteUser(userId);
			return userservice.getAllUser();
		} 
	 
	 @GetMapping("/users/{userId}")
	 public User findUserById(@PathVariable int userId) {
		return userservice.findUserById(userId); 
	 
	 }
	 
	@PutMapping("/users")
	 public User registerUser(@RequestBody User user) {
		return userservice.createUser(user);
		 
	 }
	
	@PostMapping("/users")
	 public User updateUser(@RequestBody User u) {
		return userservice.updateUser(u);
		 
	 }
	
	
	
}

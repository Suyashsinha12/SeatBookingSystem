package com.seatbooking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.Booking;
import com.seatbooking.model.User;
import com.seatbooking.repository.BookingRepository;
import com.seatbooking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	  
	  public Booking getBookingByUserId(int userId) {
		 
		 Optional< User> user = userRepository.findById(userId);
		 User u = user.get();
		 return u.getBooking();
	  }
	 
	  public User createUser(User user) {
		  return userRepository.save(user);
	  }
	  
	  public User findUserById(int userId) { 
		  Optional<User> user = userRepository.findById(userId);
		  return user.get(); 
		  
	  }
	  
	  public User updateUser(User newUser) {
		  
		  Optional<User> update =userRepository.findById(newUser.getUserId());
			User u = update.get();
			u.setUserPhone(newUser.getUserPhone());
			u.setDesignation(newUser.getDesignation());
			return userRepository.save(newUser);
			
	  }
	  
	  public void deleteUser(int userId) { 
		  userRepository.deleteById(userId); 
	  }
	  
	  public List<User> getAllUser() {
			
			return userRepository.findAll();
	  }
	  
}

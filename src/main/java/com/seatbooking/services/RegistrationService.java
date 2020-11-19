package com.seatbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.User;
import com.seatbooking.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public User registerUser(User user) {
		return registrationRepository.save(user);
		
	}
	
	public User fetchUserByEmailId(String email) {
		return registrationRepository.findByUserEmail(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return registrationRepository.findByUserEmailAndUserPassword(email, password);
	}
	
	
}

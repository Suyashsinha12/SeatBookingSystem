package com.seatbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.model.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByUserEmail(String userEmail);
	public User findByUserEmailAndUserPassword(String userEmail,String userPassword);
	
}

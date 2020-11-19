package com.seatbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.model.Booking;
import com.seatbooking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	  public Booking findBookingByUserId(int userId);
 
}

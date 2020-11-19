package com.seatbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seatbooking.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

	
	
	
}

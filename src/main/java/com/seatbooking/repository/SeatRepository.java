package com.seatbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

	public Seat findBySeatId(String seatId);

	
}

package com.seatbooking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.Seat;
import com.seatbooking.repository.SeatRepository;

@Service
public class SeatService {
	
	@Autowired
	SeatRepository seatRepository;
	
	public List<Seat> getAllSeats(){
		return seatRepository.findAll();
		
	}
	
	public Seat addSeats(Seat seat){
		return seatRepository.save(seat);
		
	}
	
	 public Seat findSeatById(int id) { 
		  Optional<Seat> seat = seatRepository.findById(id);
		  return seat.get();   
	 }
	 
	 public Seat updateSeat(Seat seat) {
		  System.out.println(seat.getIsAvailable());
		  Optional<Seat> update =seatRepository.findById(seat.getId());
			Seat b = update.get();
			b.setIsAvailable(seat.getIsAvailable());
			return seatRepository.save(seat);
			
			
	  }

}

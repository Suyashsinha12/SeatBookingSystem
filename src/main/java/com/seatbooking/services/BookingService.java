package com.seatbooking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.Booking;
import com.seatbooking.model.Seat;
import com.seatbooking.repository.BookingRepository;
import com.seatbooking.repository.SeatRepository;



@Service
public class BookingService {

	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	SeatRepository seatRepository;
	
	public List<Booking> getAllBooking(){
		return bookingRepository.findAll();
		
	}
	
	public void deleteBooking(long bookingId) {
		bookingRepository.deleteById(bookingId);
	}
	
	public Booking addBooking(Booking booking,String seatId) {
		
		 System.out.println("Seat"+booking.getBookingDate());
		Seat seat=seatRepository.findBySeatId(seatId);
		seat.setIsAvailable(false);
		seatRepository.save(seat);
		return bookingRepository.save(booking);
	}
	
	
	
	 public Booking findBookingById(long bookingId) { 
		  Optional<Booking> book = bookingRepository.findById(bookingId);
		  return book.get();   
	 }
	 
	 public Booking updateBooking(Booking booking) {
		  
		  Optional<Booking> update =bookingRepository.findById(booking.getBookingId());
			Booking b = update.get();
			b.setSeat(booking.getSeat());
			return bookingRepository.save(booking);
			
	  }
	
}

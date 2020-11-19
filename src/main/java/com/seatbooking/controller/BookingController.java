package com.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.model.Booking;
import com.seatbooking.model.Seat;
import com.seatbooking.services.BookingService;
import com.seatbooking.services.SeatService;

@RestController
@RequestMapping("/web")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	
	@Autowired
	BookingService bookingservice;
	
	@Autowired
	SeatService seatservice;
	

	 @GetMapping("/seats")
	 public List<Booking> getAllBooking(){
		return bookingservice.getAllBooking();
	}
	 
	 @GetMapping("/seats/available")
	public List<Seat> getAllSeats(){
		return seatservice.getAllSeats();
	}
	 
	 @PostMapping("/seats")
	 public Seat addSeats(@RequestBody Seat seat) {
		 return seatservice.addSeats(seat);
	 }
	 
	 @PostMapping("/status")
	public Seat updateSeat(@RequestBody Seat seat) {
		 System.out.println("in controller"+seat.getIsAvailable());
		return seatservice.updateSeat(seat);
		 
	 }

	 @GetMapping("/status/{id}")
	 public Seat findSeatById(@PathVariable int id) { 
		 return seatservice.findSeatById(id);
	 }
	 
	 
	 @GetMapping("/admins/afterDelete/{bookingId}")
	public List<Booking> deleteBooking(@PathVariable long bookingId) {
			System.out.println(bookingId);
		bookingservice.deleteBooking(bookingId);
		return bookingservice.getAllBooking();	
	}

	
	 
	 @PostMapping("/add/booking/{seatId}")
	public Booking addnewBooking(@RequestBody Booking booking,@PathVariable String seatId) {
		 System.out.println("date"+booking.getBookingDate());
		return bookingservice.addBooking(booking,seatId);
	}
	
	
	
	@GetMapping("/admins/{bookingId}")	
	 public Booking findBookingById(@PathVariable long bookingId) { 
		  return bookingservice.findBookingById(bookingId);
	 }
	 
	@PostMapping("/admins")
	 public Booking updateBooking(@RequestBody Booking book) {
		return bookingservice.updateBooking(book);
		 
	 }
	 
	 
}

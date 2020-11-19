package com.seatbooking.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private String bookingDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Seat seat;
	
	
	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	
	}

	public Booking() {
		super();
		
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Booking(long bookingId, String bookingDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (bookingId != other.bookingId)
			return false;
	
		return true;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + "]";
	} 

	
}

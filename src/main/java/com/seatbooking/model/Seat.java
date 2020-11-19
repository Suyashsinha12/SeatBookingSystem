package com.seatbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allseats")
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String seatId;
	boolean isAvailable;
	
	public Seat() {
		super();
		
	}
	

	public Seat(int id, String seatId, boolean isAvailable) {
		super();
		this.id = id;
		this.seatId = seatId;
		this.isAvailable = isAvailable;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + ((seatId == null) ? 0 : seatId.hashCode());
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
		Seat other = (Seat) obj;
		if (id != other.id)
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (seatId == null) {
			if (other.seatId != null)
				return false;
		} else if (!seatId.equals(other.seatId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", seatId=" + seatId + ", isAvailable=" + isAvailable + "]";
	}
	

	
}

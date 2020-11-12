package com.seatbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SeatStatus {

	@Id
	@GeneratedValue
	int seat_no;
	String s_status;
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public String getS_status() {
		return s_status;
	}
	public void setS_status(String s_status) {
		this.s_status = s_status;
	}
	public SeatStatus(int seat_no, String s_status) {
		super();
		this.seat_no = seat_no;
		this.s_status = s_status;
	}
	public SeatStatus() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s_status == null) ? 0 : s_status.hashCode());
		result = prime * result + seat_no;
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
		SeatStatus other = (SeatStatus) obj;
		if (s_status == null) {
			if (other.s_status != null)
				return false;
		} else if (!s_status.equals(other.s_status))
			return false;
		if (seat_no != other.seat_no)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SeatStatus [seat_no=" + seat_no + ", s_status=" + s_status + "]";
	}
	public int view_status(int status) {
		if(status==1)
		{
			System.out.println("seat is already booked");
		
			return 1;
		}
		else 
		{
			System.out.println("not yet booked");
			return 0;
		}
		}
	

}

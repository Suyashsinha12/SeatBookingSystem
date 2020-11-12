package com.seatbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contactdetails {

	@Id
	@GeneratedValue
	int mobile_no;

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Contactdetails(int mobile_no) {
		super();
		this.mobile_no = mobile_no;
	}

	public Contactdetails() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobile_no;
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
		Contactdetails other = (Contactdetails) obj;
		if (mobile_no != other.mobile_no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contactdetails [mobile_no=" + mobile_no + "]";
	}
}

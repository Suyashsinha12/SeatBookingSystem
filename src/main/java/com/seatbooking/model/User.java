package com.seatbooking.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userPassword;
	private long userPhone;
	private String userEmail;
	private String designation;
	private String useraddress;
	private String state;
	private String city;
	private String country;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	public Booking booking;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//public Address add;
	
	
	public User() {
		super();
		
	}
	
	public User(int userId, String userName, String userPassword, long userPhone, String userEmail, String designation,
			String useraddress, String state, String city, String country, Booking booking) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.designation = designation;
		this.useraddress = useraddress;
		this.state = state;
		this.city = city;
		this.country = country;
		this.booking = booking;
	}
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((booking == null) ? 0 : booking.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + (int) (userPhone ^ (userPhone >>> 32));
		result = prime * result + ((useraddress == null) ? 0 : useraddress.hashCode());
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
		User other = (User) obj;
		if (booking == null) {
			if (other.booking != null)
				return false;
		} else if (!booking.equals(other.booking))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userPhone != other.userPhone)
			return false;
		if (useraddress == null) {
			if (other.useraddress != null)
				return false;
		} else if (!useraddress.equals(other.useraddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userPhone="
				+ userPhone + ", userEmail=" + userEmail + ", designation=" + designation + ", useraddress="
				+ useraddress + ", state=" + state + ", city=" + city + ", country=" + country + ", booking=" + booking
				+ "]";
	}

}

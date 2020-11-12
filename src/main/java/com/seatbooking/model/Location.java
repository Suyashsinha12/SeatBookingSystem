package com.seatbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue
	String loc_name;
	int code;
	String off_name;
	String country;
	public String getLoc_name() {
		return loc_name;
	}
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getOff_name() {
		return off_name;
	}
	public void setOff_name(String off_name) {
		this.off_name = off_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Location(String loc_name, int code, String off_name, String country) {
		super();
		this.loc_name = loc_name;
		this.code = code;
		this.off_name = off_name;
		this.country = country;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((loc_name == null) ? 0 : loc_name.hashCode());
		result = prime * result + ((off_name == null) ? 0 : off_name.hashCode());
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
		Location other = (Location) obj;
		if (code != other.code)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (loc_name == null) {
			if (other.loc_name != null)
				return false;
		} else if (!loc_name.equals(other.loc_name))
			return false;
		if (off_name == null) {
			if (other.off_name != null)
				return false;
		} else if (!off_name.equals(other.off_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Location [loc_name=" + loc_name + ", code=" + code + ", off_name=" + off_name + ", country=" + country
				+ "]";
	}
}

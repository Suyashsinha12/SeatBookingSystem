package com.seatbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin extends User{

	@Id 
	@GeneratedValue
	private String adminKey;
		
		public Admin() {
			super();
		}

		public Admin( String username, String password, String adminKey) {
			super(username,password);
			this.adminKey= adminKey;
		}

		public String getAdminKey() {
			return adminKey;
		}

		public void setAdminKey(String adminKey) {
			this.adminKey = adminKey;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((adminKey == null) ? 0 : adminKey.hashCode());
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
			Admin other = (Admin) obj;
			if (adminKey == null) {
				if (other.adminKey != null)
					return false;
			} else if (!adminKey.equals(other.adminKey))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Admin [adminKey=" + adminKey + "]";
		}
		
}

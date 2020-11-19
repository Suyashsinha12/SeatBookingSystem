package com.seatbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.Admin;
import com.seatbooking.repository.AdminRepository;

@Service
public class AdminService {

	 	@Autowired
	    AdminRepository adminRepository;

	 	public Admin fetchAdminByEmailId(String email) {
			return adminRepository.findByAdminName(email);
		}
		public Admin fetchAdminByEmailIdAndPassword(String email,String password) {
			return adminRepository.findByAdminNameAndAdminPassword(email, password);
		}
		  
		 
}

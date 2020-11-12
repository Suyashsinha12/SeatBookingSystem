package com.seatbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.model.Admin;
import com.seatbooking.repository.AdminRepository;

@Service
public class AdminService {

	 	@Autowired
	    AdminRepository adminRepository;

		/*
		 * @GetMapping("/admin") public Iterable<Admin>
		 * findAllThareOwners(@RequestParam(name = "username", required = false) String
		 * username,
		 * 
		 * @RequestParam(name = "password", required = false) String password) { if
		 * (username != null && password != null) { return
		 * adminRepository.findAdminByCredentials(username, password); } else if
		 * (username != null) { return adminRepository.findAdminByUsername(username); }
		 * return adminRepository.findAll(); }
		 */

}

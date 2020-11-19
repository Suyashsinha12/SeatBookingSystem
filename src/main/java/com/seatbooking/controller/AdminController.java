package com.seatbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.model.Admin;
import com.seatbooking.services.AdminService;

@RestController
@RequestMapping("/web")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@PostMapping("/adminlogin")
	@CrossOrigin(origins = "http://localhost:4200")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmailId = admin.getAdminName();
		String tempPass = admin.getAdminPassword();
		Admin adminobj = null;
		if(tempEmailId != null && tempPass != null) {
			adminobj  = adminservice.fetchAdminByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(adminobj == null) {
			throw new Exception("Bad credentials");
		}
		return adminobj;
	}

}

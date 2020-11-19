package com.seatbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seatbooking.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer > {
	
	public Admin findByAdminName(String adminName);
	public Admin findByAdminNameAndAdminPassword(String adminName,String adminPassword);
	
	 
}

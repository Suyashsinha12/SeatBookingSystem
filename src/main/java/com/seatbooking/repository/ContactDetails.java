package com.seatbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetails extends JpaRepository<ContactDetails, Integer> {

}

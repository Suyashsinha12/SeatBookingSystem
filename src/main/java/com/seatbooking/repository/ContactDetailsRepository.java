package com.seatbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seatbooking.model.Contactdetails;

@Repository
public interface ContactDetailsRepository extends JpaRepository<Contactdetails, Integer> {

}

package com.seatbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.seatbooking.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}

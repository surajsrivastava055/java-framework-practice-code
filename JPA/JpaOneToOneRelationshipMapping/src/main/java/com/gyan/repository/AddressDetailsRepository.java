package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyan.entity.Address;

public interface AddressDetailsRepository extends JpaRepository<Address, Integer> {

}

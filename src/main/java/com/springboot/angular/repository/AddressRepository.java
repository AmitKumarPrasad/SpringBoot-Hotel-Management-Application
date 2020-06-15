package com.springboot.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angular.model.Address;
import com.springboot.angular.model.Hotel;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	

}

package com.springboot.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angular.model.Delivery;
import com.springboot.angular.model.Hotel;

@Repository
public interface DeliveryRepositroy extends JpaRepository<Delivery, Integer> {

	Delivery findByPartnerName(String partnerName);

}

package com.springboot.angular.service;

import com.springboot.angular.model.Delivery;

public interface DeliveryService {
	void updateDelivery(Delivery delivery);

	void deleteDelivery(int deliveryId);

	Delivery getDeliveryById(int deliveryId);

	Delivery getDeliveryByPartner(String partnerName);

}

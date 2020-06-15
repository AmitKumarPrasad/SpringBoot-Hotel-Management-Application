package com.springboot.angular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.angular.model.Delivery;
import com.springboot.angular.repository.DeliveryRepositroy;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	private DeliveryRepositroy deliveryRepository;

	@Override
	public void updateDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);

	}

	@Override
	public void deleteDelivery(int deliveryId) {
		deliveryRepository.deleteById(deliveryId);

	}

	@Override

	public Delivery getDeliveryById(int deliveryId) {

		return deliveryRepository.findById(deliveryId).get();
	}

	@Override

	public Delivery getDeliveryByPartner(String partnerName) {
		return deliveryRepository.findByPartnerName(partnerName);
	}

}

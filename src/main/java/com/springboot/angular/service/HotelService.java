package com.springboot.angular.service;

import java.util.List;

import com.springboot.angular.model.Hotel;

public interface HotelService {

	public Hotel addHotel(Hotel hotel);

	void updateHotel(Hotel hotel);

	Hotel getHotelById(int hotelId);

	void deleteHotel(int hotelId);

	List<Hotel> getHotelsByCity(String city);

	List<Hotel> getHotelsByMenu(String menuName);

	List<Hotel> getHotelsByDelivery(String patnerName);

	List<Hotel> getHotelsByLocation(String location);

	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);

}

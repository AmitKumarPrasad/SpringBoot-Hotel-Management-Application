package com.springboot.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.angular.model.Hotel;
import com.springboot.angular.service.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping("/addHotels")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		hotelService.addHotel(hotel);
		return new ResponseEntity<Hotel>(hotel, HttpStatus.ACCEPTED);
	}

	@PutMapping("/updateHotel")
	public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel) {
		hotelService.updateHotel(hotel);
		return ResponseEntity.ok("Updated");
	}

	@GetMapping("/hotel-by-id/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable(value = "id") int id) {

		Hotel hotel = hotelService.getHotelById(id);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "getting one hotel instance");
		return ResponseEntity.ok().headers(header).body(hotel);
	}

	@DeleteMapping("/hotels/hotel-by-id/{id}")
	public ResponseEntity<Void> deleteHotel(@PathVariable(value = "id") int id) {
		hotelService.deleteHotel(id);
		return ResponseEntity.ok().build();

	}

	@GetMapping("/hotels-by-city/{cityName}")
	public ResponseEntity<List<Hotel>> getHotelsByCity(@PathVariable("cityName") String cityName) {

		List<Hotel> hotelList = hotelService.getHotelsByCity(cityName);
		return ResponseEntity.ok().body(hotelList);

	}

	@GetMapping("/hotels-by-menu/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelsByMenu(@PathVariable("menuName") String menuName) {
		List<Hotel> hotelList = hotelService.getHotelsByMenu(menuName);
		return ResponseEntity.ok().body(hotelList);

	}

	@GetMapping("/hotels-by-delivery/{partnerName}")
	public ResponseEntity<List<Hotel>> getHotelsByDelivery(@PathVariable String partnerName) {
		List<Hotel> hotelList = hotelService.getHotelsByDelivery(partnerName);
		return ResponseEntity.ok().body(hotelList);

	}

	@GetMapping("/hotels-by-location/{location}")
	public ResponseEntity<List<Hotel>> getHotelsByLocation(@PathVariable(value = "location") String location) {
		List<Hotel> hotelList = hotelService.getHotelsByLocation(location);
		return ResponseEntity.ok().body(hotelList);
	}

	@GetMapping("/hotels-by-location/{location}/menuName/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable String location, String menuName) {
		List<Hotel> hotelList = hotelService.getHotelsByMenu(menuName);
		return ResponseEntity.ok().body(hotelList);

	}

}

package com.springboot.angular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.angular.model.Address;
import com.springboot.angular.model.Delivery;
import com.springboot.angular.model.Hotel;
import com.springboot.angular.model.Menu;
import com.springboot.angular.service.DeliveryService;
import com.springboot.angular.service.HotelService;
import com.sun.el.stream.Stream;

@SpringBootApplication
public class SpringBootBackendRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendRestApiApplication.class, args);
	}

	/*
	 * @Autowired private HotelService hotelService;
	 * 
	 * @Autowired private DeliveryService deliveryService;
	 */

	

		/*
		 * Address address = new Address("Nigdi", "Ruppenagar", 123456, "Pune"); Menu
		 * menu1 = new Menu("Biryani", 350); Menu menu2 = new Menu("Veg-Biryani", 200);
		 * Set<Menu> menuList = new HashSet<Menu>(Arrays.asList(menu1, menu2)); Delivery
		 * delivery = deliveryService.getDeliveryByPartner("Swiggy"); Set<Delivery>
		 * deliverList = new HashSet<Delivery>(Arrays.asList(delivery)); Hotel hotel =
		 * new Hotel("Pune hotel", address, menuList, deliverList);
		 * hotelService.addHotel(hotel);
		 */

		/*
		 * Hotel hotel = hotelService.getHotelById(1); System.out.println(hotel);
		 * hotel.getAddress().setCity("Pune"); hotelService.updateHotel(hotel); hotel =
		 * hotelService.getHotelById(1); System.out.println(hotel);
		 */

		/*
		 * hotelService.getHotelsByCity("Ruppenagar").stream() .forEach((h) ->
		 * System.out.println(h.getHotelName() + h.getAddress().getCity()));
		 * System.out.println(); hotelService.getHotelsByLocation("Nigdi").stream()
		 * .forEach((h) -> System.out.println(h.getHotelName() + h.getMenuList()));
		 */
	

}

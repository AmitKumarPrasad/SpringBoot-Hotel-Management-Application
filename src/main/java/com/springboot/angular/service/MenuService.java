package com.springboot.angular.service;

import java.util.List;

import com.springboot.angular.model.Menu;

public interface MenuService {

	List<Menu> getMenusByHotel(String hotelName);

}

package com.springboot.angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.angular.model.Menu;
import com.springboot.angular.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public List<Menu> getMenusByHotel(String hotelName) {
		return menuRepository.findByHotel(hotelName);
	}

}

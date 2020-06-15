package com.springboot.angular.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "totel_table")
public class Hotel {

	@Id
	@GeneratedValue(generator = "hotel_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "hotel_id", sequenceName = "hotel_id")
	private Integer hotelId;
	private String hotelName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	//@JsonIgnore
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel_id")
	//@JsonIgnore
	private Set<Menu> menuList;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "hotel_delivery",
	joinColumns = @JoinColumn(name="hotel_id"),
	inverseJoinColumns = @JoinColumn(name="delivery_Id"))
	//@JsonIgnore
	private Set<Delivery> delivery;

	public Hotel(String hotelName, Address address, Set<Menu> menuList, Set<Delivery> delivery) {
		super();
		this.hotelName = hotelName;
		this.address = address;
		this.menuList = menuList;
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", menuList="
				+ menuList + ", delivery=" + delivery + "]";
	}

}

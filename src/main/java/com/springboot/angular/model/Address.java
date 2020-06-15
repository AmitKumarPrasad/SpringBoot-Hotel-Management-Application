package com.springboot.angular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class Address {

	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_id", sequenceName = "address_id")
	private Integer addressId;

	private String streetName;
	private String city;
	private long zipcode;
	private String state;

	public Address(String streetName, String city, long zipcode, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}
	
	
	

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", city=" + city + ", zipcode="
				+ zipcode + ", state=" + state + "]";
	}

}

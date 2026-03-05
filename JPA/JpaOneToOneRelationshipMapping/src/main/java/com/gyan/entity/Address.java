package com.gyan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="addressDetails")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	private String city;
	private int pincode;
	private String country;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address( String city, int pincode, String country) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.country = country;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", pincode=" + pincode + ", country=" + country + "]";
	}
	
	
	
	
}

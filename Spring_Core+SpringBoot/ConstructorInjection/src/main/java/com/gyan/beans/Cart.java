package com.gyan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cart {
	
	private String address;
	
	private Food food;
	
	// it's optional
	public Cart() {
		super();
		System.out.println("Cart Default constructor called");
	}
	
	@Autowired
	public Cart(@Qualifier("food") Food food) {
		super();
		System.out.println("Cart Parametrized constructor called");
		this.food = food;
	}
	
	public Cart(String address, Food food) {
		super();
		System.out.println("Cart 2 argument Parametrized constructor called");
		this.address=address;
		this.food = food;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Food getFood() {
		return food;
	}

	@Autowired
	public void setFood(Food food) {
		this.food = food;
	}
	
	public String toString() {
		return "Cart [address=" + address + ", food=" + food + "]";
	}
	


}

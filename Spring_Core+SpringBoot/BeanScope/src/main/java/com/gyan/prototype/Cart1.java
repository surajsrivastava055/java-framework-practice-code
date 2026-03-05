package com.gyan.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cart1")
public class Cart1 {
	
	private String address;
	
//	@Qualifier("food1")
	@Autowired
	private Food1 food;
	
	public Cart1() {
		super();
		System.out.println("Cart Default constructor called");
	}

	public Cart1(String address, Food1 food) {
		super();
		System.out.println("Cart Parametrized constructor called");
		this.address = address;
		this.food = food;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Food1 getFood() {
		return food;
	}

	public void setFood(Food1 food) {
		this.food = food;
	}

//	@Override
//	public String toString() {
//		return "Cart [address=" + address + ", food=" + food + "]";
//	}
	
	
	
	
	

}

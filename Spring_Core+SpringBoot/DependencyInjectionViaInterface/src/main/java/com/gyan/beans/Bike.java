package com.gyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public Bike() {
		System.out.println("Vehicle Bike Object Created....");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Bike is running....");
	}

}

package com.gyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public Car() {
		System.out.println("Vehicle Car Object Created....");
	}
	
	@Override
	public void run() {
		System.out.println("Vehicle Car is running....");
		
	}

}

package com.gyan.beans;

import org.springframework.stereotype.Component;

@Component()
public class Bus implements Vehicle{
	
	public Bus() {
		System.out.println("Vehicle Bus Object Created....");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Bus is running....");
	}

}

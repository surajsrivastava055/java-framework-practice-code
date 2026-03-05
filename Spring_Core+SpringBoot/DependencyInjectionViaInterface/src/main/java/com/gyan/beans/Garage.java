package com.gyan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Garage {
	
	@Qualifier("car")
	@Autowired
	private Vehicle vehicle;

	public Garage() {
		super();
		System.out.println("Default Constructor Called And garage Object Created....");
	}
	
	
	public Garage(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "Garage [vehicle=" + vehicle + "]";
	}
	
	

}

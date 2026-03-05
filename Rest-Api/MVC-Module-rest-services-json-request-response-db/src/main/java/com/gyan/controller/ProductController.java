package com.gyan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.CarInformation;
import com.gyan.request.ModelInformation;

@RestController
@RequestMapping("/get")
public class ProductController {
	
	/*
	 * JSON array of String values
	 * ["Ford","BMW","Skoda", "Toyota"]
	 */
	@GetMapping(path="/cars")
	public String getCarBrandNames(@RequestBody List<String> carBrandsName) {
		System.out.println("Car Brands name:"+ carBrandsName);
		return "Recived all car brands name";
	}
	
	/*
	 * JSON array of objects values (Car Model information)
	 [
	 	{
	 		"modelName":"Kylog",
	 		"modelYear":"2025",
	 		"fuelType":"Petrol",
	 		"price":800000
	 	},
	 	{
	 		"modelName":"Kylog",
	 		"modelYear":"2023",
	 		"fuelType":"Diesel",
	 		"price":1000000
	 	},
	 	{
	 		"modelName":"Kushaq",
	 		"modelYear":"2025",
	 		"fuelType":"Petrol/Petrol",
	 		"price":1200000
	 	}
	 ]
	 */
	@GetMapping(path="/models ")
	public String getCarBrandInfromation(@RequestBody List<ModelInformation> carBrandsInfo) {
		System.out.println("Car Brands name:"+ carBrandsInfo);
		return "Recived all car brands Information...";
	}
	
	/*
	 * JSON Data array of objects values (Car information)
	 
	 {
	 	"brandName":"Skoda",
		"carsInfo":[
					 	{
					 		"modelName":"Kylog",
					 		"modelYear":"2025",
					 		"fuelType":"Petrol",
					 		"price":800000
					 	},
					 	{
					 		"modelName":"Kylog",
					 		"modelYear":"2023",
					 		"fuelType":"Diesel",
					 		"price":1000000
					 	},
					 	{
					 		"modelName":"Kushaq",
					 		"modelYear":"2025",
					 		"fuelType":"Petrol/Petrol",
					 		"price":1200000
					 	}
		 			]
	 }
	 */
	@GetMapping(path="/carInfo")
	public String getCarInfromation(@RequestBody CarInformation  carInfo) {
		System.out.println("Car Brands name:"+ carInfo);
		return "Recived all car Information...";
	}

}

package com.gyan.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.CarInformation;
import com.gyan.request.ModelInformation;

@RestController
@RequestMapping("/get")
public class ProductController {
	
	/*
	 * XML array of String values
	 * <Cars>
		  <Car>Ford</Car>
		  <Car>BMW</Car>
		  <Car>Skoda</Car>
		  <Car>Toyota</Car>
		</Cars>
	 */
	@GetMapping(path="/cars", consumes = MediaType.APPLICATION_XML_VALUE)
	public String getCarBrandNames(@RequestBody List<String> carBrandsName) {
		System.out.println("Car Brands name:"+ carBrandsName);
		return "Recived all car brands name";
	}
	
	/*
	 * XML array of objects values (Car Model information)
<CarModels>
	  <CarModel>
	    <modelName>Kylog</modelName>
	    <modelYear>2025</modelYear>
	    <fuelType>Petrol</fuelType>
	    <price>800000</price>
	  </CarModel>
	  <CarModel>
	    <modelName>Kylog</modelName>
	    <modelYear>2025</modelYear>
	    <fuelType>Petrol</fuelType>
	    <price>800000</price>
	  </CarModel>
	  <CarModel>
	    <modelName>Kylog</modelName>
	    <modelYear>2025</modelYear>
	    <fuelType>Petrol</fuelType>
	    <price>800000</price>
	  </CarModel>
	</CarModels>
<CarModels>

	 */
	@PostMapping(path="/models")
	public String getCarBrandInfromation(@RequestBody List<ModelInformation> carBrandsInfo) {
		System.out.println("Car Brands name:"+ carBrandsInfo);
		return "Recived all car brands Information...";
	}
	
	/*
	 * XML Data array of objects values (Car information)
	 
	 <CarBrand>
  <brandName>Skoda</brandName>

  <carsInfo>
    <CarModel>
      <modelName>Kylog</modelName>
      <modelYear>2025</modelYear>
      <fuelType>Petrol</fuelType>
      <price>800000</price>
    </CarModel>

    <CarModel>
      <modelName>Kylog</modelName>
      <modelYear>2025</modelYear>
      <fuelType>Petrol</fuelType>
      <price>800000</price>
    </CarModel>

    <CarModel>
      <modelName>Kylog</modelName>
      <modelYear>2025</modelYear>
      <fuelType>Petrol</fuelType>
      <price>800000</price>
    </CarModel>
  </carsInfo>
</CarBrand>

	 */
	@GetMapping(path="/carInfo")
	public String getCarInfromation(@RequestBody CarInformation  carInfo) {
		System.out.println("Car Brands name:"+ carInfo);
		return "Recived all car Information...";
	}

}

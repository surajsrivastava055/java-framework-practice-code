package com.gyan.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ProductDetails {
	
 	private int id;
	
	@NotEmpty(message="Should not be empty")
	@NotNull(message="Should not be null")
	@NotBlank(message="Should not be blank")
	private String name;
	
	private double price;
	
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetails(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

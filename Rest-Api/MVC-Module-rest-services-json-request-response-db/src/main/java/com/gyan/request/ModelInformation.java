package com.gyan.request;

public class ModelInformation {
	
	private String modelName;
	private String modelYear;
	private String fuelType;
	private  double price;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ModelInformation [modelName=" + modelName + ", modelYear=" + modelYear + ", fuelType=" + fuelType
				+ ", price=" + price + "]";
	}
	
}

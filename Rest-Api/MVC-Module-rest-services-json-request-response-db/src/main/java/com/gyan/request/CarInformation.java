package com.gyan.request;

import java.util.List;

public class CarInformation {
	
	private String brandName;
	private List<ModelInformation> carsInfo;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<ModelInformation> getCarsInfo() {
		return carsInfo;
	}
	public void setCarsInfo(List<ModelInformation> carsInfo) {
		this.carsInfo = carsInfo;
	}
	
	@Override
	public String toString() {
		return "CarInformation [brandName=" + brandName + ", carsInfo=" + carsInfo + "]";
	}
	
	
}

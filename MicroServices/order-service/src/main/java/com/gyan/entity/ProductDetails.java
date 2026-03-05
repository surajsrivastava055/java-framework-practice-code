package com.gyan.entity;

public class ProductDetails {

	private Integer productId;
	private String productName;
	private double price;
	
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetails(Integer productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	} 
}

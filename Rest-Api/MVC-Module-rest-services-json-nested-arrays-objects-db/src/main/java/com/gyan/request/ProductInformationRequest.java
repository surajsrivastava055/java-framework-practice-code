package com.gyan.request;

import java.util.List;

public class ProductInformationRequest {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private List<String> specification;
	
	public ProductInformationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductInformationRequest(int productId, String productName, double price, int quantity,
			List<String> specification) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.specification = specification;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<String> getSpecification() {
		return specification;
	}
	public void setSpecification(List<String> specification) {
		this.specification = specification;
	}
	
	@Override
	public String toString() {
		return "ProductInformationRequest [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", specification=" + specification + "]";
	}
	
	
}

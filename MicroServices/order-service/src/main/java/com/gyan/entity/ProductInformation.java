package com.gyan.entity;

import java.util.List;

public class ProductInformation {
	private String emailId;
	private List<ProductDetails> productInfo;
	private double totalAmount;
	
	public ProductInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductInformation(String emailId, List<ProductDetails> productInfo, double totalAmount) {
		super();
		this.emailId = emailId;
		this.productInfo = productInfo;
		this.totalAmount = totalAmount;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<ProductDetails> getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(List<ProductDetails> productInfo) {
		this.productInfo = productInfo;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "ProductInformation [emailId=" + emailId + ", productInfo=" + productInfo + ", totalAmount="
				+ totalAmount + "]";
	}
	
	
	
	
	
}

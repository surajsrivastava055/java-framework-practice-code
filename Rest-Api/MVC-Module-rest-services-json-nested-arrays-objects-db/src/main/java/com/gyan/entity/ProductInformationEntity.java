package com.gyan.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="amazon_productInfo_details")
public class ProductInformationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private List<String> specification;
	
	public ProductInformationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductInformationEntity(int productId, String productName, double price, int quantity,
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

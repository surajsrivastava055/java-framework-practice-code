package com.gyan.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="amazon_order_details")
public class OrderDetailsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	private String name;
	private String emailId;
	private String mobileNumber;
	private double totalAmount;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductInformationEntity> productInformationRequest;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DeliveryAddressEntity deliveryAddressRequest;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PaymentDetailsEntity paymentDetailsRequest;

	public OrderDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailsEntity(int orderId, String name, String emailId, String mobileNumber, double totalAmount,
			List<ProductInformationEntity> productInformationRequest, DeliveryAddressEntity deliveryAddressRequest,
			PaymentDetailsEntity paymentDetailsRequest) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.totalAmount = totalAmount;
		this.productInformationRequest = productInformationRequest;
		this.deliveryAddressRequest = deliveryAddressRequest;
		this.paymentDetailsRequest = paymentDetailsRequest;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<ProductInformationEntity> getProductInformationRequest() {
		return productInformationRequest;
	}

	public void setProductInformationRequest(List<ProductInformationEntity> productInformationRequest) {
		this.productInformationRequest = productInformationRequest;
	}

	public DeliveryAddressEntity getDeliveryAddressRequest() {
		return deliveryAddressRequest;
	}

	public void setDeliveryAddressRequest(DeliveryAddressEntity deliveryAddressRequest) {
		this.deliveryAddressRequest = deliveryAddressRequest;
	}

	public PaymentDetailsEntity getPaymentDetailsRequest() {
		return paymentDetailsRequest;
	}

	public void setPaymentDetailsRequest(PaymentDetailsEntity paymentDetailsRequest) {
		this.paymentDetailsRequest = paymentDetailsRequest;
	}

	@Override
	public String toString() {
		return "OrderDetailsRequest [orderId=" + orderId + ", name=" + name + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", totalAmount=" + totalAmount + ", productInformationRequest="
				+ productInformationRequest + ", deliveryAddressRequest=" + deliveryAddressRequest
				+ ", paymentDetailsRequest=" + paymentDetailsRequest + "]";
	}
	

}

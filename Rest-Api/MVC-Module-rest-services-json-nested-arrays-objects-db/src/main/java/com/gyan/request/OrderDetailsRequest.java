package com.gyan.request;

import java.util.List;

public class OrderDetailsRequest {
	private int orderId;
	private String name;
	private String emailId;
	private String mobileNumber;
	private double totalAmount;
	
	private List<ProductInformationRequest> productInformationRequest;
	
	private DeliveryAddressRequest deliveryAddressRequest;
	
	private PaymentDetailsRequest paymentDetailsRequest;

	public OrderDetailsRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailsRequest(int orderId, String name, String emailId, String mobileNumber, double totalAmount,
			List<ProductInformationRequest> productInformationRequest, DeliveryAddressRequest deliveryAddressRequest,
			PaymentDetailsRequest paymentDetailsRequest) {
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

	public List<ProductInformationRequest> getProductInformationRequest() {
		return productInformationRequest;
	}

	public void setProductInformationRequest(List<ProductInformationRequest> productInformationRequest) {
		this.productInformationRequest = productInformationRequest;
	}

	public DeliveryAddressRequest getDeliveryAddressRequest() {
		return deliveryAddressRequest;
	}

	public void setDeliveryAddressRequest(DeliveryAddressRequest deliveryAddressRequest) {
		this.deliveryAddressRequest = deliveryAddressRequest;
	}

	public PaymentDetailsRequest getPaymentDetailsRequest() {
		return paymentDetailsRequest;
	}

	public void setPaymentDetailsRequest(PaymentDetailsRequest paymentDetailsRequest) {
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

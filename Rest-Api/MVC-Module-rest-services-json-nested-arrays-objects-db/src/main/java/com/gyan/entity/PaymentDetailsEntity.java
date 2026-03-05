package com.gyan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="amazon_payment_details")
public class PaymentDetailsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	private double paidAmount;
	private String paymentStatus;
	private String transactionId;
	
	public PaymentDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PaymentDetailsEntity(int paymentId, double paidAmount, String paymentStatus, String transactionId) {
		super();
		this.paymentId = paymentId;
		this.paidAmount = paidAmount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	@Override
	public String toString() {
		return "PaymentDetailsRequest [paymentId=" + paymentId + ", paidAmount=" + paidAmount + ", paymentStatus="
				+ paymentStatus + ", transactionId=" + transactionId + "]";
	}
	
	

}

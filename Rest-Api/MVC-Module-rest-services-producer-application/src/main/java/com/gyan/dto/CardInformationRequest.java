package com.gyan.dto;

public class CardInformationRequest {
	
	private long cardNumber;
	private int cvv;
	private String expMonthYear;
	private double amountToBePaid;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExpMonthYear() {
		return expMonthYear;
	}
	public void setExpMonthYear(String expMonthYear) {
		this.expMonthYear = expMonthYear;
	}
	public double getAmountToBePaid() {
		return amountToBePaid;
	}
	public void setAmountToBePaid(double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	@Override
	public String toString() {
		return "CardInformationRequest [cardNumber=" + cardNumber + ", cvv=" + cvv + ", expMonthYear=" + expMonthYear
				+ ", amountToBePaid=" + amountToBePaid + "]";
	}
	public CardInformationRequest(long cardNumber, int cvv, String expMonthYear, double amountToBePaid) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expMonthYear = expMonthYear;
		this.amountToBePaid = amountToBePaid;
	}
	public CardInformationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

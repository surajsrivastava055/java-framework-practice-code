package com.gyan.dto;

public class NetBankingInformationRequest {
	
	private String userName;
	private String password;
	private double amountToBePaid;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmountToBePaid() {
		return amountToBePaid;
	}
	public void setAmountToBePaid(double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	
	@Override
	public String toString() {
		return "NetBankingInformationRequest [userName=" + userName + ", password=" + password + ", amountToBePaid="
				+ amountToBePaid + "]";
	}
	
	public NetBankingInformationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NetBankingInformationRequest(String userName, String password, double amountToBePaid) {
		super();
		this.userName = userName;
		this.password = password;
		this.amountToBePaid = amountToBePaid;
	}
	
	
	
	

}

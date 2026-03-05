package com.gyan.dto;

public class NetBankingDetailsDto {
	
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
		return "NetBankingDetailsDto [userName=" + userName + ", password=" + password + ", amountToBePaid="
				+ amountToBePaid + "]";
	}
	public NetBankingDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NetBankingDetailsDto(String userName, String password, double amountToBePaid) {
		super();
		this.userName = userName;
		this.password = password;
		this.amountToBePaid = amountToBePaid;
	}
	
	
	
	

}

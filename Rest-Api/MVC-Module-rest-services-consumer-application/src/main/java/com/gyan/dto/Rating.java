package com.gyan.dto;

public class Rating {
	private double rate;
	private int count;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(double rate, int count) {
		super();
		this.rate = rate;
		this.count = count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Rating [rate=" + rate + ", count=" + count + "]";
	}
	
	
	

}

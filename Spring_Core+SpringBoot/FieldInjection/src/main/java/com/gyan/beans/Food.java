package com.gyan.beans;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("food1")
public class Food {
	
	private int noOfItems;
	private List<String> itemsList;
	
	public Food() {
		super();
		System.out.println("Food Default constructor called");
	}
	

	public Food(int noOfItems, List<String> itemsList) {
		super();
		System.out.println("Food Parametrized Constructor called");
		this.noOfItems = noOfItems;
		this.itemsList = itemsList;
	}



	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		System.out.println("setNoOfItems setter called");
		this.noOfItems = noOfItems;
	}

	public List<String> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<String> itemsList) {
		System.out.println("setItemsList setter called");
		this.itemsList = itemsList;
	}

	@Override
	public String toString() {
		return "Food [noOfItems=" + noOfItems + ", itemsList=" + itemsList + "]";
	}
	
}

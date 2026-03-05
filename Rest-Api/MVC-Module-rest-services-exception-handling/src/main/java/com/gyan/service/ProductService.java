package com.gyan.service;

import org.springframework.stereotype.Service;

import com.gyan.request.ProductDetails;

@Service
public class ProductService {

	public String addProduct(ProductDetails productDetails) {
	
		//TODO: write repository and save in db...
		String name=productDetails.getName();
		//System.out.println("name:"+name.charAt(30)); 
		String name1=null;
		System.out.println(name1.toLowerCase());
		return "User Added Successfully..";
	}

}

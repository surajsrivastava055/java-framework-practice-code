package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.ProductDetails;
import com.gyan.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add/product")
	public String addProduct(@Valid @RequestBody ProductDetails product ) {
		
		return productService.addProduct(product);
		
	}
}

package com.gyan.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.entity.ProductDetails;
import com.gyan.entity.ProductInformation;
import com.gyan.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody ProductInformation productInformation ) {
		
		System.out.println("Create Order successfully :"+productInformation);
		return "Order Created Successfully OrderId:"+UUID.randomUUID();
	}
	
	@GetMapping("/info/{orderId}")
	public ProductInformation createOrder(@PathVariable String orderId ) {
		
		System.out.println("Order Information for OrderId :"+orderId);
		
		List<ProductDetails> data=new ArrayList<>();
		data.add(new ProductDetails(123,"iPhone",865876));
		data.add(new ProductDetails(1234,"iPod",10000));
		
		
		return new ProductInformation("gyan@gmail.com",data,769887);
	}
	
	@GetMapping("payment/options")
	public List<String> getAllPaymentOptions(){
		return orderService.getAllPaymentOptions();
	}
	
	@GetMapping("payment/options/v2")
	public List<String> getAllPaymentOptionsV2(){
		return orderService.getAllPaymentOptionsV2();
	}
	
	@GetMapping("payment/netbanking")
	public String netbanking(){
		return orderService.netbanking();
	}
	

}

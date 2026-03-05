package com.gyan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.entity.OrderDetailsEntity;
import com.gyan.request.OrderDetailsRequest;
import com.gyan.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderDetailsRequest orderDetailsRequest) {
		System.out.println(orderDetailsRequest);
		
		String res=orderService.createOrder(orderDetailsRequest);
		return res;
	}
	
	@GetMapping("/all/orders")
	public List<OrderDetailsEntity> loadAllOrders() {
		List<OrderDetailsEntity> data=orderService.loadAllOrdersDetails();
		return data;
	}

}

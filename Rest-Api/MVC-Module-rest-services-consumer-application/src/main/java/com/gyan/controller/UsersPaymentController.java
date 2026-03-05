package com.gyan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.dto.CommentDetailsResponse;
import com.gyan.dto.ProductDetailsResponse;
import com.gyan.dto.StoreProductRequest;
import com.gyan.dto.StoreProductResponse;
import com.gyan.service.FakeApiService;
import com.gyan.service.UsersPaymentService;

import io.swagger.v3.oas.models.parameters.QueryParameter;

@RestController
public class UsersPaymentController {
	
	@Autowired
	UsersPaymentService UsersPaymentService;
	
	@Autowired
	FakeApiService  fakeApiService;
	
	@GetMapping("/users/payment/options")
	public List<String> getAllPaymentOptions(){
		
		System.out.println("In user payment controller : consumer application");
		return UsersPaymentService.getAllPaymentOptions();
		
	}
	
	@GetMapping("/call/net/banking")
	public String callNetBanking() {
		return UsersPaymentService.callNetBanking();
	}
	
	//Calling FakeApiService data where we have request body along with response body
	@PostMapping("/test/add/product")
	public StoreProductResponse addProduct(@RequestBody StoreProductRequest request) {
		
		return fakeApiService.addNewProduct(request);
	}
	
	//Calling fakeApiService data where we have path variable
	@GetMapping("/test/product/{id}")
	public StoreProductResponse getProductInfo(@PathVariable int id) {
		return fakeApiService.getProductInfo(id);
	}
	
	//Calling fakeApiService data where we have Query params
	@GetMapping("/test/comments/{postId}")
	public List<CommentDetailsResponse> getComment(@PathVariable String postId) {
		return fakeApiService.getComment(postId);
	}
	
	//With Header example with consumer and producer
	@GetMapping("/validate")
	public String validateToken() {
		System.out.println("Controller Consumer called...");
		return UsersPaymentService.validateToken();
	}
}


package com.gyan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.dto.NetBankingInfo;

@RestController
public class PaymentController {
	
	Logger logger=LoggerFactory.getLogger(PaymentController.class);
	
	@GetMapping("/options")
	public List<String> getAllPaymentOptions(){
		logger.info("Request Payment Option:");
		return List.of("UPI","Credit Card","Debit Card","Net Banking");
	}
	
	@PostMapping("/netbanking")
	public String netBanking(@RequestBody NetBankingInfo netBankingInfo){
		logger.info("Request for NetBanking Payment");
		return "Payment Success";
	}
	
	//Credit card
	//Debit card
}

package com.gyan.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gyan.dto.NetBankingInfo;

@FeignClient("payment-service")
public interface PaymentServiceFeignClient {
	
	@GetMapping("payment/options")
	List<String> getPaymentOption();
	
	@PostMapping("payment/netbanking")
	public String netBanking(@RequestBody NetBankingInfo netBankingInfo);
}

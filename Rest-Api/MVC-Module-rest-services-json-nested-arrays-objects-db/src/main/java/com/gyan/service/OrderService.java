package com.gyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.DeliveryAddressEntity;
import com.gyan.entity.OrderDetailsEntity;
import com.gyan.entity.PaymentDetailsEntity;
import com.gyan.entity.ProductInformationEntity;
import com.gyan.repository.OrderRepository;
import com.gyan.request.OrderDetailsRequest;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;

	public String createOrder(OrderDetailsRequest orderDetailsRequest) {
		
		OrderDetailsEntity orderDetails=new OrderDetailsEntity();
		
		orderDetails.setOrderId(orderDetailsRequest.getOrderId());
		orderDetails.setName(orderDetailsRequest.getName());
		orderDetails.setEmailId(orderDetailsRequest.getEmailId());
		orderDetails.setMobileNumber(orderDetailsRequest.getMobileNumber());
		orderDetails.setTotalAmount(orderDetailsRequest.getTotalAmount());
		
		DeliveryAddressEntity deliveryAddress=new DeliveryAddressEntity();
		deliveryAddress.setAddressId(orderDetailsRequest.getDeliveryAddressRequest().getAddressId());
		deliveryAddress.setStreetName(orderDetailsRequest.getDeliveryAddressRequest().getStreetName());
		deliveryAddress.setBuildingName(orderDetailsRequest.getDeliveryAddressRequest().getBuildingName());
		deliveryAddress.setFlatNumber(orderDetailsRequest.getDeliveryAddressRequest().getFlatNumber());
		deliveryAddress.setCity(orderDetailsRequest.getDeliveryAddressRequest().getCity());
		deliveryAddress.setState(orderDetailsRequest.getDeliveryAddressRequest().getState());
		deliveryAddress.setPincode(orderDetailsRequest.getDeliveryAddressRequest().getPincode());
		orderDetails.setDeliveryAddressRequest(deliveryAddress);
		
		PaymentDetailsEntity paymentDetails=new PaymentDetailsEntity();
		paymentDetails.setPaymentId(orderDetailsRequest.getPaymentDetailsRequest().getPaymentId());
		paymentDetails.setPaidAmount(orderDetailsRequest.getPaymentDetailsRequest().getPaidAmount());
		paymentDetails.setPaymentStatus(orderDetailsRequest.getPaymentDetailsRequest().getPaymentStatus());
		paymentDetails.setTransactionId(orderDetailsRequest.getPaymentDetailsRequest().getTransactionId());
		orderDetails.setPaymentDetailsRequest(paymentDetails);
		
		List<ProductInformationEntity> productInformation=orderDetailsRequest.getProductInformationRequest()
																			.stream()
																			.map(p-> new ProductInformationEntity(
																					p.getProductId(),
																					p.getProductName(),
																					p.getPrice(),
																					p.getQuantity(),
																					p.getSpecification())).toList();
				
		orderDetails.setProductInformationRequest(productInformation);
		
		orderRepository.save(orderDetails);
				
		return "Order details successfully added";
	}

	public List<OrderDetailsEntity> loadAllOrdersDetails() {
		
		List<OrderDetailsEntity> orders= orderRepository.findAll();
		
		// Please convert OrderDetailsEntity into OrderDetailsResponse and then return to controller please follow best practice only....
		
		return orders;
		
	}
	
}

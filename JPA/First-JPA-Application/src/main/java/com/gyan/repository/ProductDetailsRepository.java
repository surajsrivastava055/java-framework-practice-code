package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyan.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {

}

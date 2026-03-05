package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.OrderDetailsEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetailsEntity, Integer>{

}

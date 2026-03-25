package com.example.Fruits.veggies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Fruits.veggies.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}

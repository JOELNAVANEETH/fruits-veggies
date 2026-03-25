package com.example.Fruits.veggies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Fruits.veggies.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

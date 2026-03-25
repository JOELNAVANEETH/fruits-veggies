package com.example.Fruits.veggies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Fruits.veggies.model.Product;
import com.example.Fruits.veggies.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
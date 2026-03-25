package com.example.Fruits.veggies.service;

import java.util.List;

import com.example.Fruits.veggies.model.Order;

public interface OrderService {

    Order placeOrder(Order order);

    List<Order> getAllOrders();
}

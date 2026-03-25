package com.example.Fruits.veggies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Fruits.veggies.model.Order;
import com.example.Fruits.veggies.model.OrderItem;
import com.example.Fruits.veggies.model.Product;
import com.example.Fruits.veggies.repository.OrderRepository;
import com.example.Fruits.veggies.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    
    private final ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository,
                            ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

@Override

public Order placeOrder(Order order) {

    double total = 0; // 💰 total amount

    for (OrderItem item : order.getItems()) {

        // 🔥 Fetch product from DB
        Product product = productRepository.findById(
                item.getProduct().getId()
        ).orElseThrow(() -> new RuntimeException("Product not found"));

        // ⚠️ Check stock
        if (product.getQuantity() < item.getQuantity()) {
            throw new RuntimeException("Not enough stock for product: " + product.getName());
        }

        // ✅ Reduce stock
        product.setQuantity(product.getQuantity() - item.getQuantity());

        // Save updated product
        productRepository.save(product);

        // 🔗 Attach full product object to item
        item.setProduct(product);

        // 💰 CALCULATE TOTAL
        total += product.getPrice() * item.getQuantity();
    }

    // 💰 SET TOTAL IN ORDER
    order.setTotalAmount(total);

    // 💾 Save order
    return orderRepository.save(order);
}

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

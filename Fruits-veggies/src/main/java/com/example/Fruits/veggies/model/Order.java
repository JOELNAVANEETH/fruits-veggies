package com.example.Fruits.veggies.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    // 💰 NEW FIELD (Total Price)
    private double totalAmount;

    // 🔥 FIXED MAPPING (NO JOIN TABLE)
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    public Order() {}

    public Order(String customerName, List<OrderItem> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public Long getId() { return id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    // 💰 Getter & Setter for totalAmount
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public List<OrderItem> getItems() { return items; }

    public void setItems(List<OrderItem> items) {
        this.items = items;

        // 🔗 IMPORTANT: set order reference in each item
        if (items != null) {
            for (OrderItem item : items) {
                item.setOrder(this);
            }
        }
    }
}

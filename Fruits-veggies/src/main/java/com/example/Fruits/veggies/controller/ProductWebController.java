package com.example.Fruits.veggies.controller;

import com.example.Fruits.veggies.model.Product;
import com.example.Fruits.veggies.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/web-products")
public class ProductWebController {

    private final ProductService service;

    public ProductWebController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public String showProducts() {
        List<Product> products = service.getAllProducts();
        StringBuilder html = new StringBuilder("<h1>Products List</h1><ul>");
        for (Product p : products) {
            html.append("<li>")
                .append(p.getName())
                .append(" - ")
                .append(p.getCategory())
                .append(" - $")
                .append(p.getPrice())
                .append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}


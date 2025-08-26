package com.codevepa.webapplication.controller;

import com.codevepa.webapplication.model.Product;
import com.codevepa.webapplication.repository.ProductRepository;
import com.codevepa.webapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository repo;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        repo.save(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        repo.save(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        repo.deleteById(prodId);
    }
}

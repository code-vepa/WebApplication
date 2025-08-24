package com.codevepa.webapplication.service;

import com.codevepa.webapplication.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
                                            new Product(101, "Iphone 16 Pro Max", 1200.0),
                                            new Product(102, "Iphone 16 Pro", 999.0),
                                            new Product(103, "Iphone 16",899.0 )));


    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int prodID) {
        return products.stream().filter(p -> p.getProdId() == prodID).
                findFirst().orElse(new Product(404, "No such Product", 0.0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i = 0, n = products.size(); i < n; i++) {
            if(products.get(i).getProdId() == product.getProdId()) {
                index = i;
                break;
            }
        }
        products.set(index, product);
    }
}

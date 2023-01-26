package com.codeburps.service;

import com.codeburps.model.Product;
import io.micrometer.core.annotation.Timed;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    @Timed(value = "getProduct.time", description = "Time taken to return Product")
    public Product getProduct(int productId) {
        return new Product(productId, "name-" + productId, (Math.random() * (500 - 50)) + 50);
    }
}

package com.codeburps.client.product;

import com.codeburps.client.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClientImpl implements ProductClient {

    @Value("${api.catalog.baseurl}")
    private String apiBaseUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Product getProduct(int productId) {
        return restTemplate.getForObject(apiBaseUrl + "/product/" + productId, Product.class);
    }
}

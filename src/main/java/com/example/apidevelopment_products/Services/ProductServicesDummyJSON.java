package com.example.apidevelopment_products.Services;

import com.example.apidevelopment_products.Dto.ProductDto;
import com.example.apidevelopment_products.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServicesDummyJSON implements ProductServices{
    RestTemplate restTemplate;

    public ProductServicesDummyJSON(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getASingleProduct(Long id) {
        ProductDto productdto = restTemplate.getForObject("https://dummyjson.com/products/"+id, ProductDto.class);
        return productdto.getProductData();
    }
}

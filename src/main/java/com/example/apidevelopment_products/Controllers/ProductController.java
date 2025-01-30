package com.example.apidevelopment_products.Controllers;

import com.example.apidevelopment_products.Models.Product;
import com.example.apidevelopment_products.Services.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/products/{id}")
    public Product getASingleProduct(@PathVariable("id") Long id){
        Product product = productServices.getASingleProduct(id);
        return product;
    }
}

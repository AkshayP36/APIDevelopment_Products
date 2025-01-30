package com.example.apidevelopment_products.Dto;

import com.example.apidevelopment_products.Models.Dimensions;
import com.example.apidevelopment_products.Models.Product;
import com.example.apidevelopment_products.Models.Reviews;

import java.util.List;

public class ProductDto {

    private Long id;
    private String title;
    private String description;
    private String category;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProductData(){
        Product product = new Product();
        product.setId(this.id);
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setCategory(this.category);
        product.setPrice(this.price);
        return product;
    }
}

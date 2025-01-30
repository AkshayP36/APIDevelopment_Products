package com.example.apidevelopment_products.Models;

public class Dimensions {
    private Double width;
    private Double height;
    private Double depth;

    public Dimensions() {
    }

    public Dimensions(Double width, Double height, Double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }
}

package com.gyan.map;

import com.gyan.set.ProductInformation1;

import java.util.Map;

public class ProductInformation2 {
    private int productId;
    private Map<String,Double> productAndPrice;

    public ProductInformation2(){
        System.out.println("ProductInformation2 object created for Map...");
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Map<String, Double> getProductAndPrice() {
        return productAndPrice;
    }

    public void setProductAndPrice(Map<String, Double> productAndPrice) {
        this.productAndPrice = productAndPrice;
    }

    @Override
    public String toString() {
        return "ProductInformation2{" +
                "productId=" + productId +
                ", productAndPrice=" + productAndPrice +
                '}';
    }
}

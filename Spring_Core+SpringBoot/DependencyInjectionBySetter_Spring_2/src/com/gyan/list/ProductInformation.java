package com.gyan.list;
import java.util.List;

public class ProductInformation {
    private int productId;
    private List<String> products;

    public ProductInformation(){
        System.out.println("Product Information object is created for List...");
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        System.out.println("Product Id for List is List:"+productId);
        this.productId = productId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        System.out.println("Products for List is:"+products);
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "productId=" + productId +
                ", products=" + products +
                '}';
    }
}


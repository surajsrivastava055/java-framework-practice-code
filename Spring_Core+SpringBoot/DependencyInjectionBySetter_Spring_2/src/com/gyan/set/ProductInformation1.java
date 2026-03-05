package com.gyan.set;
import java.util.Set;

public class ProductInformation1 {
    private int productId;
    private Set<String> products1;

    public ProductInformation1(){
        System.out.println("Product Information object is created for Set...");
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        System.out.println("Product id for List is:"+productId);
        this.productId = productId;
    }

    public Set<String> getProducts1() {
        return products1;
    }

    public void setProducts1(Set<String> products) {
        System.out.println("Products for Set is:"+products);
        this.products1 = products;
    }

    @Override
    public String toString() {
        return "ProductInformation1{" +
                "productId=" + productId +
                ", products=" + products1 +
                '}';
    }
}

package com.gyan;

public class ProductInformation {

    private int productId;
    private String productName;
    private double productPrice;
    private boolean isExpired;
    private char isAvailable;

    // Generating constructor
    public ProductInformation(){
        System.out.println("ProductInformation object created ...");
    }

    //generating getter and setter for each properties.
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        System.out.println("Product Id Set Successfully");
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        System.out.println("Product Name Set Successfully");
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        System.out.println("Product Price Set Successfully");
        this.productPrice = productPrice;
    }

    public boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean expired) {
        System.out.println("Product Expiry Set Successfully");
        isExpired = expired;
    }

    public char getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(char isAvailable) {
        System.out.println("Product Availability Set Successfully");
        this.isAvailable = isAvailable;
    }

    // Generating toString method

    @Override
    public String toString() {
        return "ProductInformation{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", isExpired=" + isExpired +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

package com.gyan.constructor;

public class Cart {

    private int noOfItems;
    private Product product;
    private Information info;

    public Cart() {
        System.out.println("Cart class default Constructor Called..");
    }

    public Cart(Product product, Information info) {
        System.out.println("Cart class 2 argument constructor called...");
        this.product = product;
        this.info = info;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public Product getProduct() {
        return product;
    }

    public Information getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "noOfItems=" + noOfItems +
                ", product=" + product +
                ", info=" + info +
                '}';
    }
}

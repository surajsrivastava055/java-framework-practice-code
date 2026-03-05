package com.gyan.byclass;

public class Cart {

    private int noOfItems;
    private Product product;
    private Information info;

    public Cart() {
        System.out.println("Cart class default Constructor Called..");
    }

    public Cart(int noOfItems, Product product, Information info) {
        System.out.println("Cart class 3 argument constructor called...");
        this.noOfItems = noOfItems;
        this.product = product;
        this.info = info;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        System.out.println("Cart class noOfItems:"+noOfItems+" Setter Called..");
        this.noOfItems = noOfItems;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        System.out.println("Cart class product:"+product+" Setter Called..");
        this.product = product;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        System.out.println("Cart class info:"+info+" Setter Called..");
        this.info = info;
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

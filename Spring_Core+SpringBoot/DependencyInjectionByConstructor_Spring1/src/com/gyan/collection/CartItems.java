package com.gyan.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CartItems {

    private String name;
    private List<String> productName;
    private Set<Integer> contact;
    private Map<String, Integer> productPrice;

    public CartItems(String name, List<String> productName, Set<Integer> contact, Map<String, Integer> productPrice) {
        this.name = name;
        this.productName = productName;
        this.contact = contact;
        this.productPrice = productPrice;
    }

    public CartItems(String name, List<String> productName, Set<Integer> contact) {
        System.out.println("3 argument constructor called...");
        this.name = name;
        this.productName = productName;
        this.contact = contact;
    }

    public CartItems() {
        System.out.println("Default Constructor called");
    }

    public CartItems(String name, List<String> productName) {
        System.out.println("2 argument Constructor called");
        this.name = name;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "CartItems{" +
                "name='" + name + '\'' +
                ", productName=" + productName +
                ", contact=" + contact +
                ", productPrice=" + productPrice +
                '}';
    }
}


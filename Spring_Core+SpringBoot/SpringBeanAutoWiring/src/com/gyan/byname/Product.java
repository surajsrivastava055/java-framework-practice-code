package com.gyan.byname;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
        System.out.println("Product class default constructor called...");
    }

    public Product(int id, String name, double price) {
        System.out.println("Product class 3 argument constructor called...");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Product class setId:"+id+" Setter called");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Product class name:"+name+" Setter called");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Product class price:"+price+" Setter called");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

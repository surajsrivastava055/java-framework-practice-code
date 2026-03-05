package com.gyan;

public class Collage {

    private String name;
    private int count;

    public Collage() {
        System.out.println("Collage default Constructor called..");
    }

    public Collage(String name, int count) {
        System.out.println("Collage 2 arguments Constructor Called..");
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

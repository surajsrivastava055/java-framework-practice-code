package com.gyan;

public class Student {

    private String name;
    private Address add;

    public Student(){
        System.out.println("Student object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address address) {
        this.add = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + add +
                '}';
    }
}

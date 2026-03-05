package com.gyan.classdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionByConstructor_Spring1\\spring.xml");

        School cartItems=(School) context.getBean("school");
        System.out.println(cartItems);

        System.out.println("Student name:"+cartItems.getTeacher().getStudent().getName());
        System.out.println("Teacher name:"+cartItems.getTeacher().getName());
        System.out.println("Student name:"+cartItems.getSchoolName());

    }
}

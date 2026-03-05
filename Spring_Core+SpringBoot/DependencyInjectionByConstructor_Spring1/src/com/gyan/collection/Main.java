package com.gyan.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionByConstructor_Spring1\\spring.xml");
        CartItems cartItems=(CartItems) context.getBean("cartitems");
        System.out.println(cartItems);

    }
}

package com.gyan.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\SpringBeanAutoWiring\\spring.xml");

        Product product=(Product) context.getBean("product");
        System.out.println(product);
        Information info=(Information) context.getBean("info");
        System.out.println(info);
        Cart cart=(Cart) context.getBean("cart");
        System.out.println(cart);
        System.out.println(cart.getProduct());
        System.out.println(cart.getInfo());
    }
}

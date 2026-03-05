package com.gyan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionBySetter_Spring_3\\spring.xml");

        Address address=(Address) context.getBean("address");
        System.out.println(address);
        System.out.println(address.hashCode());

        System.out.println("----------------------------");

        Student student=(Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getAdd().hashCode()); //Here both the hash code is referring same address.
    }
}

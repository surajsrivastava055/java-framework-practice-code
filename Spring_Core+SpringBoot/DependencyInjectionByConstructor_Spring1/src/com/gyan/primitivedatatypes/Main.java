package com.gyan.primitivedatatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionByConstructor_Spring1\\spring.xml");

        Patient p1=(Patient) context.getBean("patient1");
        System.out.println(p1);

        Patient p2=(Patient) context.getBean("patient2");
        System.out.println(p2);

        Patient p3=(Patient) context.getBean("patient3");
        System.out.println(p3);

        Patient p4=(Patient) context.getBean("patient4");
        System.out.println(p4);

        Patient p5=(Patient) context.getBean("patient5");
        System.out.println(p5);

    }
}

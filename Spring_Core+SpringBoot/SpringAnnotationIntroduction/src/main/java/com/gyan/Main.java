package com.gyan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringBeansConfiguration.class);

        Student student=(Student) context.getBean("student1");
        System.out.println(student);

        Collage collage=(Collage) context.getBean("collage");
        System.out.println(collage);

        Student student1=(Student) context.getBean("student2");
        System.out.println(student1);



    }

}

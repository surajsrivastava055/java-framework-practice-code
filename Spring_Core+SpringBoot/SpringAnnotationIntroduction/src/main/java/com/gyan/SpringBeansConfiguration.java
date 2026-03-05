package com.gyan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfiguration {

    @Bean(name="student1")
    public Student getStudent(){
        return new Student();
    }

    @Bean(name="student2")
    public Student getStudent1(){
        Student student=new Student();
        student.setId(100);
        student.setMarks(500);
        student.setName("Gyan Shrivastava");
        return student;
    }

    @Bean(name="collage")
    public Collage getCollage(){
        return new Collage("Lovely Professional University", 2500);
    }
}

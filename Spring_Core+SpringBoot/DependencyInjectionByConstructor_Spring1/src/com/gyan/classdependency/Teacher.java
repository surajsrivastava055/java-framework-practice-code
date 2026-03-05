package com.gyan.classdependency;

public class Teacher {
    private int tId;
    private String name;
    private String specification;
    private Student student;

    public Teacher(int tId, String name, String specification, Student student) {
        System.out.println("Teacher 4 argument constructor called");
        System.out.println("-----------Teacher Details set-----------");
        System.out.println("Teacher id:"+tId+", Teacher name:"+name+", Teacher specification:"+specification+", Teacher Student details:"+student);
        this.tId = tId;
        this.name = name;
        this.specification = specification;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        System.out.println("In Teacher class student details is:"+student+" set");
        this.student = student;
    }

    public Teacher(){
        System.out.println("Teacher default constructor called...");
    }
    public Teacher(int tId, String name, String specification) {
        System.out.println("Teacher 3 args constructor called...");
        this.tId = tId;
        this.name = name;
        this.specification = specification;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        System.out.println("Teacher id is:"+tId+" set");
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Teacher name is:"+name+" set");
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        System.out.println("Teacher specification is:"+specification+" set");
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", name='" + name + '\'' +
                ", specification='" + specification + '\'' +
                ", student=" + student +
                '}';
    }
}

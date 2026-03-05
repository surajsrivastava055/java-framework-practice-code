package com.gyan.classdependency;

public class Student {
    private int sId;
    private String name;
    private String qualification;

    public Student(){
        System.out.println("Student default constructor called");
    }
    public Student(int sId, String name, String qualification) {
        System.out.println("Student 3 argument constructor called");
        System.out.println("-----------Student Details set-----------");
        System.out.println("Student id:"+sId+", Student name:"+name+", Student Qualification:"+qualification);
        this.sId = sId;
        this.name = name;
        this.qualification = qualification;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        System.out.println("Student id is:"+sId+" set");
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Student name is:"+name+" set");
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        System.out.println("Student qualification is:"+qualification+" set");
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}

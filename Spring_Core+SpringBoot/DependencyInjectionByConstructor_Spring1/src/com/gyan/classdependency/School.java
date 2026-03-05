package com.gyan.classdependency;

public class School {
    private String schoolName;
    private Teacher teacher;

    public School(){
        System.out.println("School Default constructor executed..");
    }
    public School(String schoolName, Teacher teacher) {
        System.out.println("School 2-arguments constructor executed..");
        System.out.println("-----------School Details set-----------");
        System.out.println("School name:"+schoolName+", School Teacher details:"+teacher);
        this.schoolName = schoolName;
        this.teacher = teacher;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        System.out.println("School schoolName is:"+schoolName+" set");
        this.schoolName = schoolName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        System.out.println("In School teacher details is:"+teacher+" set");
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

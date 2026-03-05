package com.gyan;

public class Employee {

    private String companyName="Gyan.pvt.ltd";
    private int eid;
    private String ename;

    public Employee(){
        System.out.println("Employee Object created Successfully...");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        System.out.println("CompanyName Set Successfully");
        this.companyName = companyName;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        System.out.println("Company Employee Id Set Successfully");
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        System.out.println("Company Employee Name Set Successfully");
        this.ename = ename;
    }
}

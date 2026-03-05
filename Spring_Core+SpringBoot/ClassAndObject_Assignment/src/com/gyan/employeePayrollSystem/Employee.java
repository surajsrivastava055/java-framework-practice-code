package com.gyan.employeePayrollSystem;

public class Employee {
    private int empID;
    private String empName;
    private double basicSalary;

    private static final double DA_PERCENT=0.10;
    private static final double HRA_PERCENT=0.40;

    public Employee(int empID, String empName, double basicSalary) {
        this.empID = empID;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    // where DA-> 10% of basic salary and HRA is 40% of basic salary.
    public double grossSalary(){
        double DA= basicSalary * DA_PERCENT;
        double HRA= basicSalary * HRA_PERCENT;
        return basicSalary + DA + HRA;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", basicSalary=" + basicSalary +
                ", grossSalary=" + grossSalary() +
                '}';
    }
}

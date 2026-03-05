package com.gyan.employeePayrollSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee(123,"Jay Kumar Sharma", 25000);
        System.out.println(employee.getEmpName()+" Total Gross Salary is :"+employee.grossSalary());
        System.out.println(employee);
    }
}

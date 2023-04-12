package com.spring.test;

public class employee {

    int empID;
    String empName;
    String empDepartment;
    String empSalary;

    public employee(int empID, String empName, String empDepartment, String empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }
    public employee(){}

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

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary='" + empSalary + '\'' +
                '}';
    }
}

package com.EmployeeManagementSystem;

public class Employee extends Person {
    private double baseSalary;
    private long employeeId;
    private static long nextEmployeeId = 1;
    public Employee(String name, int birthYear, double baseSalary) {
        super(name, birthYear);
        this.baseSalary = baseSalary;
        this.employeeId = nextEmployeeId++;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public double calculatePay() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", employeeId=" + employeeId +
                '}';
    }
}

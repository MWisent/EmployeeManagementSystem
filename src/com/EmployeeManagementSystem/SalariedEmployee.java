package com.EmployeeManagementSystem;

public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String name, int birthYear,  double bonus) {
        super(name, birthYear, 3000.0);
        this.bonus = bonus;
    }
    public void addBonus(double bonus) {
        this.bonus += bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculatePay() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "bonus=" + bonus +
                '}';
    }
}

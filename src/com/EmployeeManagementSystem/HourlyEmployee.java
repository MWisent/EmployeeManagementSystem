package com.EmployeeManagementSystem;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double overtimeRate;
    private static final int STANDARD_HOURS = 160;
    public HourlyEmployee(String name, int birthYear, int hoursWorked, double hourlyRate, double overtimeRate) {
        super(name, birthYear, 2000.0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
    }

    public HourlyEmployee(String name, int birthYear) {
        super(name, birthYear, 2000.0);
        this.hoursWorked = 164;
        this.hourlyRate = 12.45;
        this.overtimeRate = 12;
    }
    public void addHoursWorked(int hours) {
        this.hoursWorked += hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    @Override
    public double calculatePay() {
        double totalPay = 0.0;
        if (hoursWorked <= STANDARD_HOURS) {
            totalPay = hourlyRate * hoursWorked;
        } else {
            int overTimeHoures = hoursWorked - STANDARD_HOURS;
            totalPay = (hourlyRate * STANDARD_HOURS) + (overtimeRate * overTimeHoures);
        }
        return totalPay + getBaseSalary();

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", overtimeRate=" + overtimeRate +
                '}';
    }
}

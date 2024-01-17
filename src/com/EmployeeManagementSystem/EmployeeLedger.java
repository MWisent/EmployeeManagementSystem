package com.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class EmployeeLedger {
    private List<Employee> employeeList;

    public EmployeeLedger() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employeeList.contains(employee)) {
            employeeList.add(employee);
        }
    }
    public void removeEmployee(Employee employee) {
        if (employee != null && employeeList.contains(employee) ) {
            employeeList.remove(employee);
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList);
    }

}

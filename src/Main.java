import com.EmployeeManagementSystem.Employee;
import com.EmployeeManagementSystem.EmployeeLedger;
import com.EmployeeManagementSystem.SalariedEmployee;
import com.EmployeeManagementSystem.HourlyEmployee;

import java.time.Year;

public class Main {
    public static void main(String[] args) {

        EmployeeLedger employeeLedger = new EmployeeLedger();


        Employee employee1 = new Employee("Marcin", 1990, 2000.0);
        Employee employee2 = new Employee("Maciek", 1992, 2000.0);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Marcin", 1990, 500.0);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Mirek", 1999, 200.0);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Marcin", 2000, 160, 14.0, 20.0);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mirek", 1980, 160, 16.0, 20.0);
        HourlyEmployee hourlyEmployee3 = new HourlyEmployee("Mirek", 1980);

        employee1.calculatePay();


        employeeLedger.addEmployee(employee1);
        employeeLedger.addEmployee(employee2);
        employeeLedger.addEmployee(salariedEmployee1);
        employeeLedger.addEmployee(salariedEmployee2);
        employeeLedger.addEmployee(hourlyEmployee1);
        employeeLedger.addEmployee(hourlyEmployee2);
        employeeLedger.addEmployee(hourlyEmployee3);

        System.out.println("Bounsy");

        for ( Employee employee : employeeLedger.getAllEmployees()) {
            if (salariedEmployee1.equals(employee)) {
                salariedEmployee1.addBonus(223.0);
            }
            System.out.println("Imię pracownika: " + employee.getName());
            System.out.println("Wiek pracownika: " + employee.getAge(employee.getBirthYear()));
            System.out.println("Wypłata: " + employee.calculatePay());
        }

    }
}
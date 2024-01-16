package com.EmployeeManagementSystem;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        if (birthYear > 1900 && birthYear <= java.time.Year.now().getValue()) {
            this.birthYear = birthYear;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy rok urodzenia");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +  name    + "," + birthYear + "}";
    }
}

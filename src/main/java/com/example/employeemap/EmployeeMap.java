package com.example.employeemap;

import java.util.Objects;

public class EmployeeMap {
    private String firstname;
    private String lastName;


    public EmployeeMap(String name, String lastName) {
        this.firstname = name;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstname + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeMap that = (EmployeeMap) o;
        return Objects.equals(firstname, that.firstname) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName);
    }

    @Override
    public String toString() {
        return "EmployeeMap{" +
                "name='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

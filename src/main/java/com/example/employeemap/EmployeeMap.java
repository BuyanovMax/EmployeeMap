//package com.example.employeemap;
//
//import java.util.Objects;
//
//public class EmployeeMap {
//    private String name;
//    private String lastName;
//
//
//    public EmployeeMap(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeMap that = (EmployeeMap) o;
//        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, lastName);
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeMap{" +
//                "name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}

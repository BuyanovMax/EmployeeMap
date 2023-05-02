package com.example.employeemap;

import java.util.Collection;

public interface EmployeeService {
    EmployeeMap createEmployee(String firstName, String lastName);

    EmployeeMap removeEmployee(String firstname, String lastName);

    EmployeeMap findEmployee(String firstname, String lastName);

    Collection<EmployeeMap> showAllEmployees();
}

package com.example.employeemap;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String,EmployeeMap> employeeMap;

    public EmployeeServiceImpl() {
        this.employeeMap = new HashMap<>();
    }

    @Override
    public EmployeeMap createEmployee(String firstName, String lastName) {
        EmployeeMap employee = new EmployeeMap(firstName, lastName);
        if (employeeMap.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("EmployeeAlreadyAdded");
        } else {
            this.employeeMap.put(employee.getFullName(),employee);
        }
        return employee;
    }

    @Override
    public EmployeeMap removeEmployee(String firstname, String lastName) {
        EmployeeMap employee = new EmployeeMap(firstname, lastName);
        if (employeeMap.containsKey(employee.getFullName())) {
            return employeeMap.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public EmployeeMap findEmployee(String firstname, String lastName) {
        EmployeeMap employee = new EmployeeMap(firstname, lastName);
        if (employeeMap.containsKey(employee.getFullName())) {
            return employeeMap.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Collection<EmployeeMap> showAllEmployees() {
        return Collections.unmodifiableCollection(employeeMap.values());
    }
}

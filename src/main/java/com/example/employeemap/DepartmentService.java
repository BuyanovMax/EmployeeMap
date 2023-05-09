package com.example.employeemap;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentService {


    private final EmployeeServiceImpl employeeServiceImpl;

    public DepartmentService(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }


    public EmployeeMap findMaxSalary(int department) {

        return employeeServiceImpl.showAllEmployees().stream()
                .filter(e -> e.getDepartment() == department)
                .max(Comparator.comparingInt(EmployeeMap::getSalary))
                .orElse(null);


    }

    public EmployeeMap findMinSalary( int department) {

        return employeeServiceImpl.showAllEmployees().stream()
                .filter(e -> e.getDepartment() == department)
                .min(Comparator.comparingInt(EmployeeMap::getSalary))
                .orElse(null);
    }

    public List<EmployeeMap> findAllEmployeeByDepartment(int department) {

        return employeeServiceImpl.showAllEmployees().stream()
                .filter(e -> e.getDepartment() == department)
                .toList();
    }

    public Map<Integer, List<EmployeeMap>> findAllEmployees() {

        return employeeServiceImpl.showAllEmployees().stream()
                .collect(Collectors.groupingBy(EmployeeMap::getDepartment));

    }
}



// Для того чтобы получить список сотрудников, надо в новый сервис заинжектить старый сервис и
// запросить список всех сотрудников, затем этот список пропустить через Stream API.


//Comparator.comparingInt(employee -> employee.getSalary())



// Возвращать сотрудника с максимальной зарплатой на основе номера отдела,
// который приходит в запрос из браузера.
// Возвращать сотрудника с минимальной зарплатой на основе номера отдела.
// Возвращать всех сотрудников по отделу.
// Возвращать всех сотрудников с разделением по отделам.
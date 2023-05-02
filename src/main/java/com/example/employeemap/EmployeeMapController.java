package com.example.employeemap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EmployeeMapController {
    private final EmployeeService employeeService;

    public EmployeeMapController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public EmployeeMap addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return this.employeeService.createEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public EmployeeMap removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.removeEmployee(firstName, lastName);

    }

    @GetMapping(path = "/find")
    public EmployeeMap findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping(path = "/allEmployees")
    public Collection<EmployeeMap> showAllEmployees() {
        return this.employeeService.showAllEmployees();
    }

}

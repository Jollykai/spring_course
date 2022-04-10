package com.jollykai.spring.rest.controller;

import com.jollykai.spring.rest.entity.Employee;
import com.jollykai.spring.rest.exception_handling.EmployeeIncorrectData;
import com.jollykai.spring.rest.exception_handling.NoSuchEmployeeException;
import com.jollykai.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.getEmployee(employeeId);

        if (employee==null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + employeeId + " in Database!");
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);
        return employee;

    }

}

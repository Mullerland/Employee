package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/emp")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.findById(id);
    }

}

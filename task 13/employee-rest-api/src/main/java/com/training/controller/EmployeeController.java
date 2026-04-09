package com.training.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.training.entity.Employee;
import com.training.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @PostMapping
    public Employee create(@Valid @RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.deleteEmployee(id);
        return "Employee deleted";
    }
}
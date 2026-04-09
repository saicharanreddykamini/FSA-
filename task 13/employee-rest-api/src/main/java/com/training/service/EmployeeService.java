package com.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.entity.Employee;
import com.training.exception.ResourceNotFoundException;
import com.training.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public Employee createEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return repository.findById(id)
                .orElseThrow(() ->
                new ResourceNotFoundException("Employee not found with id: "+id));
    }

    public void deleteEmployee(Long id){
        repository.deleteById(id);
    }
}
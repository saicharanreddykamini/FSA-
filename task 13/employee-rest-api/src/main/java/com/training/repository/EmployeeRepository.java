package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
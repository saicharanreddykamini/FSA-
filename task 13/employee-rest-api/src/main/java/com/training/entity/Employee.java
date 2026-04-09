package com.training.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is mandatory")
    @Size(min=3,max=100)
    private String name;

    @NotBlank(message="Email is mandatory")
    @Email(message="Invalid email format")
    private String email;

    @NotNull(message="Salary cannot be null")
    @DecimalMin(value="0.0",inclusive=false,message="Salary must be greater than 0")
    private Double salary;

    @NotBlank(message="Department is mandatory")
    private String department;

    public Employee() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
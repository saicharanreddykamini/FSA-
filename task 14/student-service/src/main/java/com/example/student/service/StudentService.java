package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Alice"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
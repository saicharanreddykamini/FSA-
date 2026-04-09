package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Student;
import com.training.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student updateStudent(int id, Student student) {
        Student s = repository.findById(id).get();
        s.setName(student.getName());
        s.setDepartment(student.getDepartment());
        return repository.save(s);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
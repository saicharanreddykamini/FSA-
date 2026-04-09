package com.example.studentmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public void saveStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public List<Student> getStudentsByDepartment(String dept) {
        return repo.findByDepartment(dept);
    }

    public List<Student> getStudentsByAge(int age) {
        return repo.findByAgeGreaterThan(age);
    }

    public Page<Student> getStudentsWithPagination(int pageNo, int pageSize, String sortBy) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return repo.findAll(pageable);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).get();
    }
}
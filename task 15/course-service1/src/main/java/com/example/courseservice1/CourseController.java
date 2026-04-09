package com.example.courseservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public String getCourses() {
        return "Course Service1 Running Successfully";
    }
}
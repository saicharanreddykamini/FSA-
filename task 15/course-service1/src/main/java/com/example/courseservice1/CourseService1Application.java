package com.example.courseservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Optional (you can keep or remove)
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class CourseService1Application {

    public static void main(String[] args) {
        SpringApplication.run(CourseService1Application.class, args);
    }
}
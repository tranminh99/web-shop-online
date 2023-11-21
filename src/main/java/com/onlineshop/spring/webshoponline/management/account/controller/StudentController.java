package com.onlineshop.spring.webshoponline.management.account.controller;

import com.onlineshop.spring.webshoponline.management.account.entity.Student;
import com.onlineshop.spring.webshoponline.management.account.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getHello")
    public List<Student> getStudents() {
        return studentService.hello();
    }

}

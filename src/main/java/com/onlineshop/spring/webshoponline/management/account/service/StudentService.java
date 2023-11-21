package com.onlineshop.spring.webshoponline.management.account.service;

import com.onlineshop.spring.webshoponline.management.account.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> hello() {
        return List.of(new Student(1L, "John", "12a", 12, LocalDate.of(1999, Month.DECEMBER, 19), "tranminh99tb@gmail.com"));
    }
}

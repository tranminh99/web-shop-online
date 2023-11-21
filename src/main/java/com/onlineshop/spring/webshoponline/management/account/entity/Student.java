package com.onlineshop.spring.webshoponline.management.account.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class Student {
    private Long id;
    private String name;
    private String classes;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(Long id, String name, String classes, Integer age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Student() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

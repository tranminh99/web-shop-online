package com.onlineshop.spring.webshoponline;

import com.onlineshop.spring.webshoponline.management.account.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class WebShopOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebShopOnlineApplication.class, args);
    }
}

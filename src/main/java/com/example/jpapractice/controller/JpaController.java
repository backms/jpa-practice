package com.example.jpapractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JpaController {

    @GetMapping("/health_check")
    public String status() {
        return "Welcome to the Jpa Practice";
    }

}

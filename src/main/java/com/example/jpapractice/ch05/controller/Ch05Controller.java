package com.example.jpapractice.ch05.controller;

import com.example.jpapractice.ch05.service.Ch05Service;
import org.springframework.web.bind.annotation.GetMapping;

public class Ch05Controller {

    private Ch05Service ch05Service;

    public Ch05Controller(com.example.jpapractice.ch05.service.Ch05Service ch05Service){
        this.ch05Service = ch05Service;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcom to Ch05";
    }

}

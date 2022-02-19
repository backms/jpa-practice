package com.example.jpapractice.controller;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcome to the Jpa Practice";
    }

    @PostMapping("/ch2")
    public String ch02(){

        memberService.memberRegist();

        return null;
    }

}

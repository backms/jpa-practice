package com.example.jpapractice.controller;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.service.MemberService;
import com.example.jpapractice.vo.RequestMember;
import com.example.jpapractice.vo.ResponseMember;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<ResponseMember> ch02(@RequestBody RequestMember requestMember){

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = mapper.map(requestMember, MemberDto.class);

        memberService.memberRegist(memberDto);

        ResponseMember responseMember = mapper.map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

}
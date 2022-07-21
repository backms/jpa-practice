package com.example.jpapractice.ch05.controller;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.service.Service;
import com.example.jpapractice.ch05.vo.RequestMember;
import com.example.jpapractice.ch05.vo.ResponseMember;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Controller {

    private Service service;

    public Controller(Service service){
        this.service = service;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcom to Ch05";
    }

    @PostMapping("/member")
    public ResponseEntity<ResponseMember> insertMember(@RequestBody RequestMember requestMember){

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = mapper.map(requestMember, MemberDto.class);

        service.insertMember(memberDto);

        ResponseMember responseMember = mapper.map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }


}

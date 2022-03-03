package com.example.jpapractice.controller;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.jpa.MemberEntity;
import com.example.jpapractice.service.MemberService;
import com.example.jpapractice.vo.RequestMember;
import com.example.jpapractice.vo.ResponseMember;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ch02")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcome to the Jpa Practice";
    }

    @PostMapping("/member")
    public ResponseEntity<ResponseMember> ch02(@RequestBody RequestMember requestMember){

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = mapper.map(requestMember, MemberDto.class);

        memberService.memberRegist(memberDto);

        ResponseMember responseMember = mapper.map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    @GetMapping("/member")
    public ResponseEntity<List<ResponseMember>> getMember(){

        Iterable<MemberEntity> memberList = memberService.getMemberByAll();

        List<ResponseMember> result = new ArrayList<>();
        memberList.forEach( v -> {
            result.add(new ModelMapper().map(v, ResponseMember.class));
        });

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<ResponseMember> getMemberById(@PathVariable Long id) {

        MemberDto memberDto = memberService.findMemberById(id);

        ResponseMember responseMember = new ModelMapper().map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    @PutMapping("/member/{id}")
    public ResponseEntity<ResponseMember> editMember(@PathVariable Long id, @RequestBody RequestMember requestMember){

        MemberDto memberDto = memberService.findMemberById(id);

        memberDto.setAge(requestMember.getAge());
        memberDto.setUserName(requestMember.getUserName());

        memberService.memberRegist(memberDto);

        ResponseMember responseMember = new ModelMapper().map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

}

package com.example.jpapractice.ch05.controller;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;
import com.example.jpapractice.ch05.service.Member05Service;
import com.example.jpapractice.ch05.vo.RequestMember;
import com.example.jpapractice.ch05.vo.RequestTeam;
import com.example.jpapractice.ch05.vo.ResponseMember;
import com.example.jpapractice.ch05.vo.ResponseTeam;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ch05")
public class Member05Controller {

    private Member05Service memberService;

    public Member05Controller(Member05Service memberService){
        this.memberService = memberService;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcom to Ch05";
    }

    @PostMapping("/member")
    public ResponseEntity<ResponseMember> insertMember(@RequestBody RequestMember requestMember){

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = mapper.map(requestMember, MemberDto.class);

        memberService.insertMember(memberDto);

        ResponseMember responseMember = mapper.map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    @PostMapping("/team")
    public ResponseEntity<ResponseTeam> insertTeam(@RequestBody RequestTeam requestTeam){

        ModelMapper mapper = new ModelMapper();

        TeamDto teamDto = mapper.map(requestTeam, TeamDto.class);

        memberService.insertTeam(teamDto);

        ResponseTeam responseTeam = mapper.map(teamDto, ResponseTeam.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseTeam);
    }

}
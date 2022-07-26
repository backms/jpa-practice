package com.example.jpapractice.ch05.controller;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;
import com.example.jpapractice.ch05.jpa.Member05;
import com.example.jpapractice.ch05.jpa.Team05;
import com.example.jpapractice.ch05.service.Member05Service;
import com.example.jpapractice.ch05.vo.RequestMember;
import com.example.jpapractice.ch05.vo.RequestTeam;
import com.example.jpapractice.ch05.vo.ResponseMember;
import com.example.jpapractice.ch05.vo.ResponseTeam;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ch05")
public class Member05Controller {

    private Member05Service memberService;

    public Member05Controller(Member05Service memberService){
        this.memberService = memberService;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Welcome to Ch05";
    }

    @GetMapping("/member")
    public ResponseEntity<List<ResponseMember>> getMember(){

        Iterable<Member05> memberList = memberService.getMemberAll();

        List<ResponseMember> result = new ArrayList<>();
        memberList.forEach( v -> {
            result.add(new ModelMapper().map(v, ResponseMember.class));
        });

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<ResponseMember> getMemberById(@PathVariable String id){

        MemberDto memberDto = memberService.findMemberById(id);

        ResponseMember responseMember = new ModelMapper().map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    @PostMapping("/member")
    public ResponseEntity<ResponseMember> insertMember(@RequestBody RequestMember requestMember){

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = mapper.map(requestMember, MemberDto.class);

        memberService.insertMember(memberDto);

        ResponseMember responseMember = mapper.map(memberDto, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    // to-do : put, delete

    @GetMapping("/team")
    public ResponseEntity<List<ResponseTeam>> getTeam(){

        Iterable<Team05> teamList = memberService.getTeamAll();

        List<ResponseTeam> result = new ArrayList<>();
        teamList.forEach( v -> {
            result.add(new ModelMapper().map(v, ResponseTeam.class));
        });

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<ResponseTeam> getTeamById(@PathVariable String id){

        TeamDto teamDto = memberService.findTeamById(id);

        ResponseTeam responseTeam = new ModelMapper().map(teamDto, ResponseTeam.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseTeam);
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

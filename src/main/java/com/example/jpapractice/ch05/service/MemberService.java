package com.example.jpapractice.ch05.service;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;

public interface MemberService {
    void insertMember(MemberDto memberDto);

    void insertTeam(TeamDto teamDto);

}

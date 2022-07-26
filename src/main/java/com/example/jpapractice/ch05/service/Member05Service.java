package com.example.jpapractice.ch05.service;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;
import com.example.jpapractice.ch05.jpa.Member05;
import com.example.jpapractice.ch05.jpa.Team05;

public interface Member05Service {
    void insertMember(MemberDto memberDto);

    void insertTeam(TeamDto teamDto);

    Iterable<Member05> getMemberAll();

    Iterable<Team05> getTeamAll();

    MemberDto findMemberById(String id);

    TeamDto findTeamById(String id);
}

package com.example.jpapractice.ch05.service;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;
import com.example.jpapractice.ch05.jpa.Member;
import com.example.jpapractice.ch05.jpa.MemberRepository;
import com.example.jpapractice.ch05.jpa.Team;
import com.example.jpapractice.ch05.jpa.TeamRepository;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    private TeamRepository teamRepository;

    public MemberServiceImpl(MemberRepository memberRepository, TeamRepository teamRepository){
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void insertMember(MemberDto memberDto) {

        ModelMapper mapper = new ModelMapper();

        // to-do : member에 Team셋팅

        Member member1 = mapper.map(memberDto, Member.class);

        memberRepository.save(member1);

    }

    @Override
    public void insertTeam(TeamDto teamDto) {

        ModelMapper mapper = new ModelMapper();

        Team team = mapper.map(teamDto, Team.class);

        teamRepository.save(team);

    }


}

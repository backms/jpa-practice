package com.example.jpapractice.ch05.service;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.dto.TeamDto;
import com.example.jpapractice.ch05.jpa.Member05;
import com.example.jpapractice.ch05.jpa.Member05Repository;
import com.example.jpapractice.ch05.jpa.Team05;
import com.example.jpapractice.ch05.jpa.Team05Repository;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Service
public class Member05ServiceImpl implements Member05Service {

    private Member05Repository memberRepository;

    private Team05Repository teamRepository;

    public Member05ServiceImpl(Member05Repository memberRepository, Team05Repository teamRepository){
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void insertMember(MemberDto memberDto) {

        ModelMapper mapper = new ModelMapper();

        // to-do : member에 Team셋팅

        Member05 member = mapper.map(memberDto, Member05.class);

        memberRepository.save(member);

    }

    @Override
    public void insertTeam(TeamDto teamDto) {

        ModelMapper mapper = new ModelMapper();

        Team05 team = mapper.map(teamDto, Team05.class);

        teamRepository.save(team);

    }


}

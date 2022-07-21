package com.example.jpapractice.ch05.service;

import com.example.jpapractice.ch05.dto.MemberDto;
import com.example.jpapractice.ch05.jpa.Member;
import com.example.jpapractice.ch05.jpa.MemberRepository;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private MemberRepository memberRepository;

    public ServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void insertMember(MemberDto memberDto) {

        ModelMapper mapper = new ModelMapper();

        // to-do : member에 Team셋팅

        Member member1 = mapper.map(memberDto, Member.class);

        memberRepository.save(member1);

    }


}

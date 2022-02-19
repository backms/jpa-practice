package com.example.jpapractice.service;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.jpa.MemberEntity;
import com.example.jpapractice.jpa.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void memberRegist() {

        ModelMapper mapper = new ModelMapper();

        MemberDto memberDto = new MemberDto();

        memberDto.setUserName("철수");
        memberDto.setAge("29");

        MemberEntity memberEntity = mapper.map(memberDto, MemberEntity.class);

        memberRepository.save(memberEntity);

    }
}

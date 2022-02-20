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
    public void memberRegist(MemberDto memberDto) {

        ModelMapper mapper = new ModelMapper();

        MemberEntity memberEntity = mapper.map(memberDto, MemberEntity.class);

        memberRepository.save(memberEntity);

    }
}

package com.example.jpapractice.service;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.jpa.MemberEntity;
import com.example.jpapractice.jpa.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public void memberRegist(MemberDto memberDto) {

        ModelMapper mapper = new ModelMapper();

        MemberEntity memberEntity = mapper.map(memberDto, MemberEntity.class);

        memberRepository.save(memberEntity);

    }

    @Override
    public Iterable<MemberEntity> getMemberByAll() {
        return memberRepository.findAll();
    }

    @Override
    public MemberDto findMemberById(Long id) {

        MemberEntity memberEntity = memberRepository.findById(id).get();

        MemberDto memberDto = new ModelMapper().map(memberEntity, MemberDto.class);

        return memberDto;
    }

    @Override
    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }
}

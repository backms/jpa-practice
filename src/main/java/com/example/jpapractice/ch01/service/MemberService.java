package com.example.jpapractice.ch01.service;

import com.example.jpapractice.ch01.dto.MemberDto;
import com.example.jpapractice.ch01.jpa.MemberEntity;

public interface MemberService {
    void memberRegist(MemberDto memberDto);

    Iterable<MemberEntity> getMemberByAll();

    MemberDto findMemberById(Long id);

    void deleteById(Long id);
}

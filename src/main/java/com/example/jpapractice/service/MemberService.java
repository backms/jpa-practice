package com.example.jpapractice.service;

import com.example.jpapractice.dto.MemberDto;
import com.example.jpapractice.jpa.MemberEntity;

public interface MemberService {
    void memberRegist(MemberDto memberDto);

    Iterable<MemberEntity> getMemberByAll();

    MemberDto findMemberById(Long id);
}

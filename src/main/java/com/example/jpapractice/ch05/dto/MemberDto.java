package com.example.jpapractice.ch05.dto;

import com.example.jpapractice.ch05.jpa.Team05;
import lombok.Data;

@Data
public class MemberDto {

    private String id;
    private String username;
    private Team05 team;
}

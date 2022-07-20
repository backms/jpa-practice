package com.example.jpapractice.ch05.vo;

import com.example.jpapractice.ch05.jpa.Team;
import lombok.Data;

@Data
public class ResponseMember {

    private String id;

    private String username;

    private Team team;

}

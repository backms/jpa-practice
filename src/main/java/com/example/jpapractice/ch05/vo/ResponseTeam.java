package com.example.jpapractice.ch05.vo;

import com.example.jpapractice.ch05.jpa.Member05;
import lombok.Data;

import java.util.List;

@Data
public class ResponseTeam {

    private String id;

    private String name;

    private List<Member05> members;

}

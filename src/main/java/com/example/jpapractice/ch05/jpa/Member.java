package com.example.jpapractice.ch05.jpa;

import lombok.Data;

@Data
public class Member {

    private String id;
    private String username;

    private Team team;

    public void setTeam(Team team){
        this.team = team;
    }

}
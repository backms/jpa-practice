package com.example.jpapractice.ch05.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    // 연관관계 매핑
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    // 연관관계 설정
    public void setTeam(Team team){
        this.team = team;
    }

}
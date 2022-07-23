package com.example.jpapractice.ch05.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="MEMBER5")
public class Member05 {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    // 연관관계 매핑
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team05 team;

    // 연관관계 설정
    public void setTeam(Team05 team){
        this.team = team;
    }

}
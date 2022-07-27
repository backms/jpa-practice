package com.example.jpapractice.ch05.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "TEAM5")
public class Team05 {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member05> members = new ArrayList<>();

    public void addMember(Member05 member){
        this.members.add(member);
        if(member.getTeam() != this){
            member.setTeam(this);
        }
    }

}

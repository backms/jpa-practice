package com.example.jpapractice.ch05.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

}

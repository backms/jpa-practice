package com.example.jpapractice.ch05.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "TEAM5")
public class Team05 {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

}

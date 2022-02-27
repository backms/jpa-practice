package com.example.jpapractice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="MEMBER")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME")
    private String username;

    private Integer age;

}

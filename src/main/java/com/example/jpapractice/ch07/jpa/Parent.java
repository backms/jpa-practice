package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Parent {

    @Id
    @Column(name = "PARENT_ID")
    private ParentId id;     // parentId.id1과 연결


    private String name;

}

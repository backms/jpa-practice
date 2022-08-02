package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@IdClass(ParentId.class)
public class Parent {

//    @Id
//    @Column(name = "PARENT_ID1")
    @EmbeddedId
    private ParentId id1;     // parentId.id1과 연결

    @Id
    @Column(name = "PARENT_ID2")
    private String id2;

    private String name;

}

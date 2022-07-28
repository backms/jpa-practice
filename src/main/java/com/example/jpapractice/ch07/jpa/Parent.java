package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@IdClass(ParentId.class)
public class Parent {

    @EmbeddedId
    private ParentId id;     // parentId.id1과 연결

    private String name;

}

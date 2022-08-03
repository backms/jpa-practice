package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@IdClass(ChildId.class)
@Data
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    @Id
    @Column(name = "CHILD_ID")
    private String childId;

    private String name;

}

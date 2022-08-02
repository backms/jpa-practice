package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Child {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1",
                referencedColumnName = "PARENT_ID1"),
            @JoinColumn(name = "PARENT_ID2",
                referencedColumnName = "PARENT_ID2")
    })
    private Parent parent;
}

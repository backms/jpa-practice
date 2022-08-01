package com.example.jpapractice.ch07.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ParentId implements Serializable {

    @Column(name = "PARENT_ID1")
    private String id1;
    @Column(name = "PARENT_ID2")
    private String id2;

    public ParentId() {

    }

    public ParentId(String id1, String id2){
        this.id1 = id1;
        this.id2 = id2;
    }

}
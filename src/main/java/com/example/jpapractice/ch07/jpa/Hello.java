package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Hello {

    @Id
    private String id;

}

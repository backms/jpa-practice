package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BeanEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;

}

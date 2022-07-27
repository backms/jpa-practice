package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Seller extends BeanEntity {

    private String shopName;

}

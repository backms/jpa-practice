package com.example.jpapractice.ch01.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestMember {

    @NotNull
    private String userName;

    @NotNull
    private String age;

}

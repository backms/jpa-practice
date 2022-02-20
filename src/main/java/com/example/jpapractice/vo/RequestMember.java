package com.example.jpapractice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestMember {

    @NotNull
    private String userName;

    @NotNull
    private String age;

}

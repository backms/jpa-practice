package com.example.jpapractice.ch05.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestTeam {

    @NotNull
    private String id;

    @NotNull
    private String name;
}

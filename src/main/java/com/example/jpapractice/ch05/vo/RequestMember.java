package com.example.jpapractice.ch05.vo;

import com.example.jpapractice.ch05.jpa.Team05;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestMember {

    @NotNull
    private String id;

    @NotNull
    private String username;

}

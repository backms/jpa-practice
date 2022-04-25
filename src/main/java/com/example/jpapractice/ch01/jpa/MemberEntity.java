package com.example.jpapractice.ch01.jpa;

import com.example.jpapractice.ch01.common.RoleType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"})})
public class MemberEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME", nullable = false, length = 10)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)            // Enumerated - 자바의 enum 타입을 매핑할 때 사용
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)       // Temporal - 날짜 타입을 매핑할 때 사용
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob                                    // clob, blob 등으로 길이 제한이 없음
    private String description;

    @Transient
    private String temp;

}

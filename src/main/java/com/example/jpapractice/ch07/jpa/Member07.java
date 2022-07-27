package com.example.jpapractice.ch07.jpa;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
//@AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID"))   // 부모로부터 상속받은 id를 member_id로 변경
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID")),
        @AttributeOverride(name = "name", column = @Column(name = "MEMBER_NAME"))
})  // 부모로부터 상속받은 컬럼을 2개이상 변경할 때
public class Member07 extends BeanEntity {

    private String email;

}

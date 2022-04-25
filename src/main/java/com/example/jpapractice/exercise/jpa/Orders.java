package com.example.jpapractice.exercise.jpa;

import com.example.jpapractice.exercise.common.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS_EX")
@Data
public class Orders {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;         // 주문 날짜

    @Enumerated(EnumType.STRING)
    private OrderStatus status;     // 주문 상태

}

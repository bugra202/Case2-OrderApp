package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.OrderStatus;
import com.bugratasdemir.case2orderapp.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ORDER")
public class Order extends BaseEntity {

    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_ORDER",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORDER_NO",nullable = false)
    private Long orderNo;

    @Column(name = "ORDER_DATE", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "SURNAME",length = 200, nullable = false)
    private String surname;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS",length = 30,nullable = false)
    private OrderStatus status;

    @Column(name = "AMOUNT",nullable = false)
    private Double amount;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JoinColumn(name = "BILL_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Bill bill;

    @Version
    private Long version;

}

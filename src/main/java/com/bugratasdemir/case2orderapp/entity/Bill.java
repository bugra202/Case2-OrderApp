package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CustomerStatus;
import com.bugratasdemir.case2orderapp.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "BILL")
public class Bill extends BaseEntity {

    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_BILL",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "BILL_NO",nullable = false)
    private Long billNo;

    @Column(name = "COST",nullable = false,scale = 2)
    private Double cost;

}

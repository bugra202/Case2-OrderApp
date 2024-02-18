package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CustomerStatus;
import com.bugratasdemir.case2orderapp.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

/**
 * createdAt, createdBy, updatedAt, updatedBy
 * @author bugratasdemir
 */

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_CUSTOMER",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME",length = 200, nullable = false)
    private String name;

    @Column(name = "SURNAME",length = 200, nullable = false)
    private String surname;

    @Column(name = "IDENTITY_NO",nullable = false)
    private Long identityNo;

    @Column(name = "AGE",nullable = false)
    private int age;

    @Column(name = "BIRTHDATE",nullable = false)
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS",length = 30,nullable = false)
    private CustomerStatus status;

    @Version
    private Long version;
}

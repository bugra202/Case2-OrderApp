package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CustomerStatus;
import com.bugratasdemir.case2orderapp.general.BaseEntity;
import jakarta.persistence.*;


/**
 * createdAt, createdBy, updatedAt, updatedBy
 * @author bugratasdemir
 */

public class Customer extends BaseEntity {

    private Long id;

    private String name;

    private String surname;

    private int identityNo;

    private int age;

    private LocalDate birthdate;

    private CustomerStatus status;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNo=" + identityNo +
                ", age=" + age +
                ", birthdate=" + birthdate +
                ", status=" + status +
                '}';
    }

    public Customer(Long id, String name, String surname, int identityNo, int age, LocalDate birthdate, CustomerStatus status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.identityNo = identityNo;
        this.age = age;
        this.birthdate = birthdate;
        this.status = status;
    }
}

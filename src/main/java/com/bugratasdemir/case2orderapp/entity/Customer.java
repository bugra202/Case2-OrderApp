package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CustomerStatus;
import com.bugratasdemir.case2orderapp.general.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

/**
 * createdAt, createdBy, updatedAt, updatedBy
 * @author bugratasdemir
 */

@Getter
@Setter
//@Entity
//@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

  //  @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_CUSTOMER",allocationSize = 1)
   // @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
  //  @Id
   // @Column(name = "ID")
    private Long id;

   // @Column(name = "NAME",length = 200, nullable = false)
    private String name;

   // @Column(name = "SURNAME",length = 200, nullable = false)
    private String surname;

    //@Column(name = "IDENTITY_NO",nullable = false)
    private int identityNo;

   // @Column(name = "AGE",nullable = false)
    private int age;

  //  @Column(name = "BIRTHDATE",nullable = false)
    private LocalDate birthdate;

   // @Enumerated(EnumType.STRING)
  //  @Column(name = "STATUS",length = 30,nullable = false)
    private CustomerStatus status;

  //  @Version
   // private Long version;

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

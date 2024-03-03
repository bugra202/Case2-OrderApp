package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CustomerStatus;

import java.time.LocalDate;
import java.util.List;

/**
 * createdAt, createdBy, updatedAt, updatedBy
 * @author bugratasdemir
 */

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private int identityNo;
    private List<Bill> bills;
    private int age;
    private LocalDate registrationDate;
    private CustomerStatus status;
    private String companyName;

    public Customer(Long id, String name, String surname, int identityNo, List<Bill> bills, int age, LocalDate registrationDate, CustomerStatus status, String companyName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.identityNo = identityNo;
        this.bills = bills;
        this.age = age;
        this.registrationDate = registrationDate;
        this.status = status;
        this.companyName = companyName;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNo=" + identityNo +
                ", bills=" + bills +
                ", age=" + age +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

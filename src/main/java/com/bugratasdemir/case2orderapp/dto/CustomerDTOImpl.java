package com.bugratasdemir.case2orderapp.dto;

import com.bugratasdemir.case2orderapp.entity.Customer;
import com.bugratasdemir.case2orderapp.enums.CustomerStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerDTOImpl implements GenericDTO{
    List<Customer> customerList = new ArrayList<>();

    public CustomerDTOImpl() {
        this.customerList.add(new Customer(2L,"Bilal","Taşdemir",223232324,15684,LocalDate.of(1999,6,16),CustomerStatus.ACTIVE));
        this.customerList.add(new Customer(1L,"Buğra","Taşdemir",223232324,15684,LocalDate.of(1999,6,16),CustomerStatus.ACTIVE));
        this.customerList.add(new Customer(1L,"Figen","Taşdemir",223232324,15684,LocalDate.of(1999,6,16),CustomerStatus.ACTIVE));
    }

    @Override
    public List<Customer> getByAllCustomer() {
        return customerList;
    }

    //    public List<Customer> getByAllCustomer() {
//        //customerList.stream().forEach(System.out::println);
//        return customerList;
//    }
}

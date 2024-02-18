package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.entity.Customer;

import java.util.List;

public interface CustomerService {
    void getByAllCustomer(List<Customer> customerList);
    //void saveCustomer(Customer customer);
//    List<Customer> findByUsersAndNameLikeUsers();
//    List<Customer> getByTotalOfCustomersInvoicesForTheSpecifiedMonth();
}

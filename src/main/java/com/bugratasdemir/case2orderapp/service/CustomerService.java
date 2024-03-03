package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.entity.Customer;

import java.util.List;

public interface CustomerService {
     void getByAllCustomer(List<Customer> customerList);
     void saveCustomer();
     void findByCustomersAndNameLikeCustomers();
     List<String> findCustomersWithLowAmount(List<Customer> customers, double thresholdAmount);
}

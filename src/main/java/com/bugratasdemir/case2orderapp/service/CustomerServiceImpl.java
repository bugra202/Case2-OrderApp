package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.dto.CustomerDTOImpl;
import com.bugratasdemir.case2orderapp.entity.Customer;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDTOImpl customerDTO;
    @Override
    public void getByAllCustomer(List<Customer> customerList) {
        customerList.stream().map(Customer::toString).forEach(customer -> System.out.println("Customer = " + customer));
    }
}

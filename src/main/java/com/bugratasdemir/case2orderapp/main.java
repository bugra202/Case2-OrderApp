package com.bugratasdemir.case2orderapp;

import com.bugratasdemir.case2orderapp.dto.CustomerDTOImpl;
import com.bugratasdemir.case2orderapp.entity.Customer;
import com.bugratasdemir.case2orderapp.service.CustomerServiceImpl;

import java.util.List;

public class main {
    public static void main(String[] args) {

        CustomerDTOImpl customerDTO = new CustomerDTOImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        customerService.getByAllCustomer(customerDTO.getByAllCustomer());

    }
}

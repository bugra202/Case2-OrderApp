package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.dto.CustomerDTOImpl;
import com.bugratasdemir.case2orderapp.entity.Customer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService{

    private final CustomerDTOImpl customerDTO;
    public CustomerServiceImpl(CustomerDTOImpl customerDTO) {
        this.customerDTO = customerDTO;
    }
    @Override
    public void getByAllCustomer(List<Customer> customerList) {
        customerList.stream().map(Customer::toString).forEach(customer -> System.out.println("Customer = " + customer));
    }
    @Override
    public void saveCustomer() {
        customerDTO.saveEntity();
    }
    @Override
    public void findByCustomersAndNameLikeCustomers() {
        Set<Customer> customerSet = new HashSet<>(customerDTO.getByAllEntity());

        Set<Customer> filteredCustomers = customerSet.stream()
                .filter(customer -> customer.getName().contains("C"))
                .collect(Collectors.toSet());

        filteredCustomers.forEach(System.out::println);
    }

    @Override
    public List<String> findCustomersWithLowAmount(List<Customer> customers, double thresholdAmount) {
        return customers.stream()
                .filter(customer -> customer.getBills().stream().anyMatch(invoice -> invoice.getCost() < thresholdAmount))
                .map(Customer::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}

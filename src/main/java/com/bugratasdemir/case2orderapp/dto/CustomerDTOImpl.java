package com.bugratasdemir.case2orderapp.dto;

import com.bugratasdemir.case2orderapp.entity.Bill;
import com.bugratasdemir.case2orderapp.entity.Customer;
import com.bugratasdemir.case2orderapp.enums.CustomerStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerDTOImpl implements GenericDTO<Customer> {
    List<Customer> customerList = new ArrayList<>();

    public CustomerDTOImpl() {
        this.customerList.add(new Customer(1L,"BilCal","Taşdemir",223232324,List.of(new Bill[]{(Bill) (new BillDTOImpl()).billList.get(0)}),15684,LocalDate.of(2024,6,16),CustomerStatus.ACTIVE,"TESLA"));
        this.customerList.add(new Customer(2L,"Buğra","Taşdemir",223232324,List.of(new Bill[]{(Bill) (new BillDTOImpl()).billList.get(1)}),15684,LocalDate.of(2024,6,16),CustomerStatus.ACTIVE,"FORD"));
        this.customerList.add(new Customer(3L,"FigCen","Taşdemir",223232324,List.of(new Bill[]{(Bill) (new BillDTOImpl()).billList.get(2)}),15684,LocalDate.of(1999,8,16),CustomerStatus.ACTIVE,"MERCEDES"));
    }

    @Override
    public List<Customer> getByAllEntity() {
        return customerList;
    }
    @Override
    public void saveEntity() {
        Customer newCustomer = new Customer(12L,"Son","Eklenen",155834,List.of(new Bill[]{(Bill) (new BillDTOImpl()).billList.get(0)}),19,LocalDate.of(1999,6,16),CustomerStatus.ACTIVE,"TOYOTA");
        System.out.println("Müşteri " + newCustomer.toString());
        this.customerList.add(newCustomer);
    }
}

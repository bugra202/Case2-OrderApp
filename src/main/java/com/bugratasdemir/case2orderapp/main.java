package com.bugratasdemir.case2orderapp;

import com.bugratasdemir.case2orderapp.dto.BillDTOImpl;
import com.bugratasdemir.case2orderapp.dto.CustomerDTOImpl;
import com.bugratasdemir.case2orderapp.entity.Bill;
import com.bugratasdemir.case2orderapp.service.BillServiceImpl;
import com.bugratasdemir.case2orderapp.service.CustomerServiceImpl;

import java.util.List;

public class main {
    public static void main(String[] args) {

        CustomerDTOImpl customerDTO = new CustomerDTOImpl();
        BillDTOImpl billDTO = new BillDTOImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl(customerDTO);
        BillServiceImpl billService = new BillServiceImpl(billDTO);

        System.out.println("List of All Customers");
        customerService.getByAllCustomer(customerDTO.getByAllEntity());
        System.out.println("-----------------------------------------------");

        System.out.println("New customer added. Customer Information ;");
        customerService.saveCustomer();
        System.out.println("-----------------------------------------------");

        System.out.println("Customers whose names contain the letter C ;");
        customerService.findByCustomersAndNameLikeCustomers();
        System.out.println("-----------------------------------------------");

        System.out.println("List the total amount of invoices of customers who registered in June ;");
        double totalCost = BillServiceImpl.calculateTotalBillAmountForMonth(customerDTO.getByAllEntity(),6);
        System.out.println("Total " + totalCost);
        System.out.println("-----------------------------------------------");

        System.out.println("List of All Bills");
        billService.getByAllBills(billDTO.getByAllEntity());
        System.out.println("-----------------------------------------------");

        System.out.println("List of Invoices Over 1500TL");
        List<Bill> highAmountInvoices = billService.findBillsOfACertainAmount(billDTO.getByAllEntity(), 1500);
        highAmountInvoices.forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        double averageAmount = billService.findTheAverageOfACeratinAmountOfBills(billDTO.getByAllEntity(),1500);
        System.out.println("Average of Invoices Above 1500TL: " + averageAmount);
        System.out.println("-----------------------------------------------");

        System.out.println("List the names of customers with invoices under 500TL in the system:");
        List<String> customersWithLowAmount = customerService.findCustomersWithLowAmount(customerDTO.getByAllEntity(), 500);
        customersWithLowAmount.forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        System.out.println("Category names whose average Bill for June is lower than the entered parameter value: " + billService.getCategoryNamesLowerThanAverageBillAmount(750));

    }
}

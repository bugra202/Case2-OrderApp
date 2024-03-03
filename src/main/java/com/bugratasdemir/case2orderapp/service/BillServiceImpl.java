package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.dto.BillDTOImpl;
import com.bugratasdemir.case2orderapp.entity.Bill;
import com.bugratasdemir.case2orderapp.entity.Company;
import com.bugratasdemir.case2orderapp.entity.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class BillServiceImpl implements BillService{
    private final BillDTOImpl billDTO;
    public BillServiceImpl(BillDTOImpl billDTO) {
        this.billDTO = billDTO;
    }
    @Override
    public void getByAllBills(List<Bill> billList) {
        billList.stream().map(Bill::toString).forEach(bill -> System.out.println("Bill = " + bill));
    }
    @Override
    public List<Bill> findBillsOfACertainAmount(List<Bill> bills, double thresholdAmount) {

        return bills.stream()
                .filter(invoice -> invoice.getCost() >= thresholdAmount)
                .collect(Collectors.toList());

    }
    @Override
    public double findTheAverageOfACeratinAmountOfBills(List<Bill> bills, double thresholdAmount) {

        OptionalDouble average = bills.stream()
                .filter(bill -> bill. getCost() >= thresholdAmount)
                .mapToDouble(Bill::getCost)
                .average();

        return average.orElse(0.0);
    }
    public static double calculateTotalBillAmountForMonth(List<Customer> customers, int targetMonth) {
        LocalDate startOfMonth = LocalDate.of(LocalDate.now().getYear(), targetMonth, 1);
        LocalDate endOfMonth = LocalDate.of(LocalDate.now().getYear(), targetMonth, startOfMonth.lengthOfMonth());

        return customers.stream()
                .filter(customer -> customer.getRegistrationDate().isAfter(startOfMonth) && customer.getRegistrationDate().isBefore(endOfMonth))
                .flatMap(customer -> customer.getBills().stream())
                .mapToDouble(Bill::getCost)
                .sum();
    }

    public Set getCategoryNamesLowerThanAverageBillAmount(int amount) {
        boolean averageFilter = this.billDTO.getByAllEntity().stream().filter((Bill) -> {
            return Bill.getBillingDate().getMonthValue() == Month.JUNE.getValue();
        }).mapToDouble(Bill::getCost).average().orElse(0.0) < 750.0;
        Set<Object> categories = new LinkedHashSet<>();
        if (averageFilter) {
            categories = this.billDTO.getByAllEntity().stream().filter((Bill) -> {
                return Bill.getBillingDate().getMonthValue() == Month.JUNE.getValue();
            }).map(Company::getCategory).collect(Collectors.toSet());
        }

        return categories;
    }
}

package com.bugratasdemir.case2orderapp.service;

import com.bugratasdemir.case2orderapp.entity.Bill;
import com.bugratasdemir.case2orderapp.enums.CategoryEnum;

import java.util.List;
import java.util.Set;

public interface BillService {
    void getByAllBills(List<Bill> billList);
    List<Bill> findBillsOfACertainAmount(List<Bill> bills, double thresholdAmount);
    double findTheAverageOfACeratinAmountOfBills(List<Bill> invoices, double thresholdAmount);
    Set<CategoryEnum> getCategoryNamesLowerThanAverageBillAmount(int var1);

}

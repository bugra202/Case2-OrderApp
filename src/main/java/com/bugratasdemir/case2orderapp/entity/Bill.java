package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CategoryEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Bill extends Company {
    private Long id;
    private Long billNo;
    private Double cost;
    private Long customerId;
    private LocalDate billingDate;

    public Bill(String companyName, CategoryEnum category, Long id, Long billNo, Double cost, Long customerId, LocalDate billingDate) {
        super(companyName, category);
        this.id = id;
        this.billNo = billNo;
        this.cost = cost;
        this.customerId = customerId;
        this.billingDate = billingDate;
    }
    public Bill(String companyName, CategoryEnum category) {
        super(companyName, category);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billNo=" + billNo +
                ", cost=" + cost +
                ", customerId=" + customerId +
                ", billingDate=" + billingDate +
                '}';
    }
}

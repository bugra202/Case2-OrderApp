package com.bugratasdemir.case2orderapp.entity;

public class Bill {

    private Long id;

    private Long billNo;

    private Double cost;

    public Bill(java.lang.Long billNo, java.lang.Double cost) {
        this.billNo = billNo;
        this.cost = cost;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getBillNo() {
        return billNo;
    }

    public void setBillNo(java.lang.Long billNo) {
        this.billNo = billNo;
    }

    public java.lang.Double getCost() {
        return cost;
    }

    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bill{" +
                "id=" + id +
                ", billNo=" + billNo +
                ", cost=" + cost +
                '}';
    }
}

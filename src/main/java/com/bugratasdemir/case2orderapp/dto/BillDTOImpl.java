package com.bugratasdemir.case2orderapp.dto;

import com.bugratasdemir.case2orderapp.entity.Bill;
import com.bugratasdemir.case2orderapp.enums.CategoryEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillDTOImpl implements GenericDTO<Bill> {
    List<Bill> billList = new ArrayList<>();

    public BillDTOImpl() {
        this.billList.add(new Bill("FORD",CategoryEnum.OTHER,1L,1L,150.00, 1L, LocalDate.of(2018, 3, 12)));
        this.billList.add(new Bill("MERCEDES",CategoryEnum.OTHER,2L,2L,100.00,2L,LocalDate.of(2018, 3, 12)));
        this.billList.add(new Bill("BMW",CategoryEnum.OTHER,3L,3L,120.0,3L,LocalDate.of(2018, 3, 12)));
    }
    @Override
    public List<Bill> getByAllEntity() {
        return billList;
    }
    @Override
    public void saveEntity() {
        // TODO document why this method is empty
    }
}

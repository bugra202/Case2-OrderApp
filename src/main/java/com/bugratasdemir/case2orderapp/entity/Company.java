package com.bugratasdemir.case2orderapp.entity;

import com.bugratasdemir.case2orderapp.enums.CategoryEnum;

public class Company {
    private String companyName;
    private CategoryEnum category;

    public Company(String companyName, CategoryEnum category) {
        this.companyName = companyName;
        this.category = category;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }
}

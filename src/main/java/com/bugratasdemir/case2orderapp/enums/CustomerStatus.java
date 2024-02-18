package com.bugratasdemir.case2orderapp.enums;

public enum CustomerStatus implements EntityEnum{
    ACTIVE("Active"),
    INVALID("Invalid"),
    PASSIVE("Passive");
    private final String text;
    CustomerStatus(String text) {
        this.text = text;
    }
    public String stringValue() {
        return this.text;
    }
    public String getStringValue() {
        return this.stringValue();
    }
}

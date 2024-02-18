package com.bugratasdemir.case2orderapp.enums;

public enum OrderStatus implements EntityEnum{
    OLUSTURULDU("Olusturuldu"),
    HAZIRLANIYOR("Hazırlanıyor"),
    DAGITIMA_CIKTI("Dağıtıma Çıktı"),
    TESLIM_EDILDI("Teslim Edildi");
    private final String text;
    OrderStatus(String text) {
        this.text = text;
    }
    public String stringValue() {
        return this.text;
    }
    public String getStringValue() {
        return this.stringValue();
    }
}

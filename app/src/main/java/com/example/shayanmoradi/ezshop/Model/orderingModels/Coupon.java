package com.example.shayanmoradi.ezshop.Model.orderingModels;

public class Coupon {
private String code ;
private String amount;

    public Coupon(String code) {
        this.code = code;

}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

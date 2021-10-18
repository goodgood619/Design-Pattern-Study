package com.company.ProxyPattern;

public class Cash implements Payment {
    private int amount = 1000;
    @Override
    public int pay() {
        System.out.println(amount + "현금 결제");
        return amount;
    }
}

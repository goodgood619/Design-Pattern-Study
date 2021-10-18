package com.company.ProxyPattern;

public class CashPerf implements Payment{
    Payment cash = new Cash();
    @Override
    public int pay() {
        System.out.println("ProxyStart---");
        int money = cash.pay();
        System.out.println("ProxyEnd---");
        return money;
    }
}

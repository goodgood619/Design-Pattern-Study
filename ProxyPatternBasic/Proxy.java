package com.company.ProxyPattern;

public class Proxy {
    public static void main(String[] args) {
        Payment payment = new CashPerf();
        System.out.println(payment.pay());
    }
}

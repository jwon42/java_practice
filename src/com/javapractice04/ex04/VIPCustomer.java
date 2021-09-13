package com.javapractice04.ex04;

public class VIPCustomer extends Customer {
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.customerGrade = Grade.VIP;
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (price - (int)(price * this.saleRatio));
    }
}

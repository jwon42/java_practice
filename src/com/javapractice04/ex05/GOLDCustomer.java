package com.javapractice04.ex05;

public class GOLDCustomer extends Customer {
    private double saleRatio;

    public GOLDCustomer(String customerName) {
        super(customerName);
        this.customerGrade = Grade.GOLD;
        this.bonusRatio = 0.02;
        this.saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (price - (int)(price * this.saleRatio));
    }
}

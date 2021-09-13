package com.javapractice04.ex04;

public class GOLDCustomer extends Customer{
    private double saleRatio;

    public GOLDCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        this.customerGrade = Grade.GOLD;
        this.bonusRatio = 0.02;
        this.saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (price - (int)(price * this.saleRatio));
    }
}

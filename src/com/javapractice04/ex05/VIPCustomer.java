package com.javapractice04.ex05;

public class VIPCustomer extends Customer {
    private double saleRatio;
    private int agentNumber;

    public VIPCustomer(String customerName, int agentNumber) {
        super(customerName);
        this.customerGrade = Grade.VIP;
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentNumber = agentNumber;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (price - (int)(price * this.saleRatio));
    }

    @Override
    public String showCustomerInfo() {
        return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다. 담당 상담원 번호는 %d입니다",
                this.customerName, this.customerGrade.toString(), this.bonusPoint, this.agentNumber);
    }
}

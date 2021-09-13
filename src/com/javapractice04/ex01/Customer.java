package com.javapractice04.ex01;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected Grade customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        this.customerGrade = Grade.SILVER;
        this.bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다",
                this.customerName, this.customerGrade.toString(), this.bonusPoint);
    }
}

enum Grade {
    VIP {
        @Override
        public String toString() {
            return "VIP";
        }
    },
    SILVER {
        @Override
        public String toString() {
            return "SILVER";
        }
    },
}
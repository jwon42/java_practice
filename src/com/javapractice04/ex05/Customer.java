package com.javapractice04.ex05;

public class Customer {
    static private int serialNumber = 10000;
    protected int customerID;
    protected String customerName;
    protected Grade customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    {
        serialNumber += 10;
    }

    public Customer(String customerName) {
        this.customerID = serialNumber;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        this.customerGrade = Grade.SILVER;
        this.bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return price;
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
    GOLD {
        @Override
        public String toString() {
            return "GOLD";
        }
    },
    SILVER {
        @Override
        public String toString() {
            return "SILVER";
        }
    },
}
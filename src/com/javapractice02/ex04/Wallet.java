package com.javapractice02.ex04;

public class Wallet {
    // Property
    private String ownerName;
    private int balance;

    // Constructor
    public Wallet (String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter
    public String getOwnerName() {
        return this.ownerName;
    }

    public int getBalance() {
        return this.balance;
    }

    // Method
    public void deposit(int deposit) {
        if (deposit <= 0) {
            return ;
        }
        this.balance += deposit;
    }

    public void withdraw(int withdraw) {
        if ((withdraw <= 0) || (withdraw > this.balance)) {
            return ;
        }
        this.balance -= withdraw;
    }
}

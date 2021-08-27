package com.javapractice02.ex04;

public class Wallet {
    private String ownerName;
    private int balance;

    public Wallet (String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

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

package com.javapractice02.ex04;

public class Student {
    private String studentName;
    private Wallet wallet;

    public Student(String studentName, int balance) {
        this.studentName = studentName;
        this.wallet = new Wallet(studentName, balance);
    }

    public void takeBus(Bus busName) {
        busName.getOn();
        this.wallet.withdraw(1000);
    }

    public void takeSubway(Subway subwayName) {
        subwayName.getOn();
        this.wallet.withdraw(1200);
    }

    public void buyStarbucksAmericano(Starbucks starbucks) {
        starbucks.sellAmericano();
        this.wallet.withdraw(3000);
    }

    public void buyCoffeeBeanCafeLatte(CoffeeBean coffeeBean) {
        coffeeBean.sellCafeLatte();
        this.wallet.withdraw(4000);
    }

    public void showInfo() {
        System.out.printf("%s님의 남은 돈은 %d원 입니다\n", this.studentName, this.wallet.getBalance());
    }
}

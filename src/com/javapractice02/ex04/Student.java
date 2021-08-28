package com.javapractice02.ex04;

public class Student {
    // Property
    private String studentName; // 학생 이름
    private Wallet wallet; // 학생 지갑

    // Constructor
    public Student(String studentName, int balance) {
        this.studentName = studentName;
        this.wallet = new Wallet(studentName, balance); // 지갑 생성
    }

    // Method
    public void takeBus(Bus busName) {
        busName.getOn();
        this.wallet.withdraw(busName.getFare());
        System.out.printf("%s 학생은 %d원을 지불하고 %d번 버스에 탑승했습니다\n", this.studentName, busName.getFare(), busName.getBusNumber());
    }

    public void takeSubway(Subway subwayName) {
        subwayName.getOnSubway();
        this.wallet.withdraw(subwayName.getFare());
        System.out.printf("%s 학생은 %d원을 지불하고 %d번 지하철에 탑승했습니다\n", this.studentName, subwayName.getFare(), subwayName.getSubwayNumber());
    }

    public void buyStarbucksAmericano(Starbucks starbucks) {
        starbucks.sellAmericano();
        this.wallet.withdraw(starbucks.getPriceOfAmericano());
        System.out.printf("%s 학생은 %d원을 지불하고 %s에서 아메리카노를 구입했습니다\n", this.studentName, starbucks.getPriceOfAmericano(), starbucks.getCafeName());
    }

    public void buyCoffeeBeanCafeLatte(CoffeeBean coffeeBean) {
        coffeeBean.sellCafeLatte();
        this.wallet.withdraw(coffeeBean.getPriceOfCafeLatte());
        System.out.printf("%s 학생은 %d원을 지불하고 %s에서 카페라떼를 구입했습니다\n", this.studentName, coffeeBean.getPriceOfCafeLatte(), coffeeBean.getCafeName());
    }

    public void showInfo() {
        System.out.printf("%s님의 남은 돈은 %d원 입니다\n", this.studentName, this.wallet.getBalance());
    }
}

package com.javapractice02.ex04;

public class Bus {
    private int busNumber;
    private int revenue;
    private int numberOfCurrentPassenger;
    private int countOfPassenger;

    public Bus(int subwayNumber) {
        this.busNumber = subwayNumber;
    }

    public void getOn() {
        this.numberOfCurrentPassenger += 1;
        this.countOfPassenger += 1;
        this.revenue += 1000;
    }

    public void getOff() {
        this.numberOfCurrentPassenger -= 1;
    }

    public void showBusInfo() {
        System.out.printf("%d번 버스의 승객은 %d명 이고, 수입은 %d원 입니다\n", this.busNumber, this.numberOfCurrentPassenger, this.revenue);
    }
}

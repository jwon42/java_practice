package com.javapractice02.ex04;

public class Subway {
    private int subwayNumber;
    private int revenue;
    private int numberOfCurrentPassenger;
    private int countOfPassenger;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void getOn() {
        this.numberOfCurrentPassenger += 1;
        this.countOfPassenger += 1;
        this.revenue += 1000;
    }

    public void getOff() {
        this.numberOfCurrentPassenger -= 1;
    }

    public void showSubwayInfo() {
        System.out.printf("%d번 지하철의 승객은 %d명 이고, 수입은 %d원 입니다\n", this.subwayNumber, this.numberOfCurrentPassenger, this.revenue);
    }
}

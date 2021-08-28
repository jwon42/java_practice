package com.javapractice02.ex04;

public class Bus {
    // Property
    private int busNumber; // 버스 번호
    private int fare; // 운임
    private int revenue; // 수익
    private int numberOfCurrentPassenger; // 현재 탑승중인 승객 수
    private int countOfPassenger; // 누적 승객 수

    // Initialization Block
    {
        this.fare = 1000; // 버스 운임 책정
    }

    // Constructor
    public Bus(int subwayNumber) {
        this.busNumber = subwayNumber;
    }

    // Getter
    public int getBusNumber() {
        return this.busNumber;
    }

    public int getFare() {
        return this.fare;
    }

    // Method
    public void getOn() {
        this.numberOfCurrentPassenger += 1;
        this.countOfPassenger += 1;
        this.revenue += 1000;
    }

    public void getOff() {
        this.numberOfCurrentPassenger -= 1;
    }

    public void showBusInfo() {
        System.out.printf("%d번 버스에 현재 탑승중인 승객은 %d명 이고, 수입은 %d원 입니다\n", this.busNumber, this.numberOfCurrentPassenger, this.revenue);
    }
}

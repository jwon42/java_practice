package com.javapractice02.ex04;

public class Subway {
    // Property
    private int subwayNumber; // 지하철 번호
    private int fare; // 운임
    private int revenue; // 수익
    private int numberOfCurrentPassenger; // 현재 탑승중인 승객 수
    private int countOfPassenger; // 누적 승객 수

    // Initialization Block
    {
        this.fare = 1200; // 지하철 운임 책정
    }

    // Constructor
    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    // Getter
    public int getSubwayNumber() {
        return this.subwayNumber;
    }

    public int getFare() {
        return this.fare;
    }

    // Method
    public void getOnSubway() {
        this.numberOfCurrentPassenger += 1;
        this.countOfPassenger += 1;
        this.revenue += this.fare;
    }

    public void getOffSubway() {
        this.numberOfCurrentPassenger -= 1;
    }

    public void showSubwayInfo() {
        System.out.printf("%d번 지하철에 현재 탑승중인 승객은 %d명 이고, 수입은 %d원 입니다\n", this.subwayNumber, this.numberOfCurrentPassenger, this.revenue);
    }
}

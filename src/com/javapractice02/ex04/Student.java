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
        busName.getOnBus();
        this.wallet.withdraw(busName.getFare());
        System.out.printf("%s 학생은 %d원을 지불하고 %d번 버스에 탑승했습니다\n", this.studentName, busName.getFare(), busName.getBusNumber());
    }

    public void takeSubway(Subway subwayName) {
        subwayName.getOnSubway();
        this.wallet.withdraw(subwayName.getFare());
        System.out.printf("%s 학생은 %d원을 지불하고 %d번 지하철에 탑승했습니다\n", this.studentName, subwayName.getFare(), subwayName.getSubwayNumber());
    }

    public void buyCoffee(Cafe cafeName, String menuName) {
        cafeName.sellCoffee(menuName);
        this.wallet.withdraw(cafeName.getCoffeePrice(menuName));
        System.out.printf("%s 학생은 %d원을 지불하고 %s에서 %s를 구입했습니다\n", this.studentName, cafeName.getCoffeePrice(menuName), cafeName.getCafeName(), menuName);
    }

    public void showInfo() {
        System.out.printf("%s님의 남은 돈은 %d원 입니다\n", this.studentName, this.wallet.getBalance());
    }
}

package com.javapractice02.ex04;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        Starbucks starbucks = new Starbucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        studentJ.buyStarbucksAmericano(starbucks);
        System.out.println("James 학생은 3000원을 지불하고 스타벅스에서 아메리카노를 구입했습니다");
        studentT.buyCoffeeBeanCafeLatte(coffeeBean);
        System.out.println("Tomas 학생은 4000원을 지불하고 커피빈에서 카페라떼를 구입했습니다");

        studentJ.takeBus(bus100);
        System.out.println("James 학생은 1000원을 지불하고 100번 버스에 탑승했습니다");
        studentT.takeSubway(subwayGreen);
        System.out.println("Tomas 학생은 1200원을 지불하고 100번 버스에 탑승했습니다");

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}

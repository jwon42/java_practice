package com.javapractice02.ex04;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        Cafe starbucks = new Cafe("스타벅스");
        starbucks.addMenu("아메리카노", 3000);

        Cafe coffeeBean = new Cafe("커피빈");
        coffeeBean.addMenu("카페라떼", 4000);

        studentJ.buyCoffee(starbucks, "아메리카노");
        studentT.buyCoffee(coffeeBean, "카페라떼");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}

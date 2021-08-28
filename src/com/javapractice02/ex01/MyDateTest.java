package com.javapractice02.ex01;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());

        MyDate date3 = new MyDate(28, 2, 2020);
        System.out.println(date3.isValid());
        MyDate date4 = new MyDate(29, 2, 2020);
        System.out.println(date4.isValid());
        MyDate date5 = new MyDate(30, 2, 2020);
        System.out.println(date5.isValid());

        // date1.day = 10;
        // date1.month = 3;
        // date1.year = 2020;
    }
}

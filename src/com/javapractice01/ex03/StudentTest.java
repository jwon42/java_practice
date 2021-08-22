package com.javapractice01.ex03;

public class StudentTest {
    public static void main(String[] args) {
        Student jwon = new Student(1234, "원준호", 3);
        jwon.printInfo();

        Student studentLee = new Student();
        studentLee.setName("이순신");
        System.out.println(studentLee);
    }
}

package com.javapractice01.ex04;

public class PersonTest {
    public static void main(String[] args) {
        Person jane = new Person("제인", 30, Gender.FEMALE);

        jane.printInfo();
        jane.setIsMarried(true);
        jane.setNumOfChildren(1);
        jane.printInfo();

        Person jwon = new Person("원준호", 99, Gender.MALE, false,0);
//        jwon.setAge(0);
//        jwon.setNumOfChildren(-1);
        jwon.printInfo();
    }
}

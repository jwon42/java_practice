package com.javapractice03.ex03;

public class Company {
    // Property
    private static int serialNumber = 10000;
    private static Company instance = new Company();

    // Constructor
    private Company() {} // 컴파일러의 Default Constructor 생성 방지

    // Getter
    public static Company getInstance() {
        return instance;
    }

    // Method
    public Card createCard() {
        return new Card(++serialNumber);
    }
}

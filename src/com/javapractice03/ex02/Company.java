package com.javapractice03.ex02;

public class Company {
    // Property
    private static Company instance = new Company();

    // Constructor
    private Company() {} // 컴파일러의 Default Constructor 생성 방지

    // Getter
    public static Company getInstance() {
        return instance;
    }
}

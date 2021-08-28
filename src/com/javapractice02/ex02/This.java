package com.javapractice02.ex02;

public class This {
    // Property
    private int testNumber;
    private boolean testBoolean;
    private String testString;

    // Default Constructor
    public This() {}

    // Constructor
    public This(int testNumber, boolean testBoolean) {
        this.testNumber = testNumber;
        this.testBoolean = testBoolean;
    }
    public This(int testNumber, boolean testBoolean, String testString) {
        this(testNumber, testBoolean);
        this.testString = testString;
    }

    // Getter
    public int getTestNumber() {
        return this.testNumber;
    }

    public boolean getTestBoolean() {
        return this.testBoolean;
    }

    public String getTestString() {
        return this.testString;
    }

    // Method
    public void firstTest() {
        System.out.println(this);
    }

    public This returnMySelf() {
        return this;
    }
}

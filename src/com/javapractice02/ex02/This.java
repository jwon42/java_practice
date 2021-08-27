package com.javapractice02.ex02;

public class This {
    private int testNumber;
    private boolean testBoolean;
    private String testString;

    public This() {}
    public This(int testNumber, boolean testBoolean) {
        this.testNumber = testNumber;
        this.testBoolean = testBoolean;
    }
    public This(int testNumber, boolean testBoolean, String testString) {
        this(testNumber, testBoolean);
        this.testString = testString;
    }

    public int getTestNumber() {
        return this.testNumber;
    }

    public boolean getTestBoolean() {
        return this.testBoolean;
    }

    public String getTestString() {
        return this.testString;
    }

    public void firstTest() {
        System.out.println(this);
    }

    public This returnMySelf() {
        return this;
    }
}

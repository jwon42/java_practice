package com.javapractice03.ex01;

public class Student {
    // Property
    static private int serialNum = 1000;
    private int studentID;
    private String studentName;

    // Initialization Block
    {
        serialNum++;
        this.studentID = serialNum;
    }

    // Getter
    public int getStudentID() {
        return this.studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public String getStudentName() {
        return this.studentName;
    }

    // Setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}

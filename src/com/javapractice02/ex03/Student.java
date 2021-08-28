package com.javapractice02.ex03;

public class Student {
    // Property
    private int studentID;
    private String studentName;
    private Subject korean;
    private Subject math;

    // Initialization Block
    {
        this.korean = new Subject();
        this.math = new Subject();
    }

    // Constructor
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Setter
    public void setKorean(String name, int score) {
        this.korean.setName(name);
        this.korean.setScore(score);
    }

    public void setMath(String name, int score) {
        this.math.setName(name);
        this.math.setScore(score);
    }

    // Method
    public void showStudentInfo() {
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, this.korean.getScore() + this.math.getScore());
    }
}
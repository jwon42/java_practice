package com.javapractice03.ex05;

public class Subject {
    // Property
    private String subjectName;
    private int subjectScore;

    // Default Constructor
    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    // Getter
    public String getSubjectName() {
        return this.subjectName;
    }

    public int getSubjectScore() {
        return this.subjectScore;
    }
}

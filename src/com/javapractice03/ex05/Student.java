package com.javapractice03.ex05;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    // Property
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    // Initialization Block
    {
        this.subjectList = new ArrayList<>();
    }

    // Constructor
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Method
    public void addSubject(String subjectName, int subjectScore) {
        subjectList.add(new Subject(subjectName, subjectScore));
    }

    public void showStudentInfo() {
        int totalScore = 0;
        Iterator<Subject> iter = subjectList.iterator();
        while (iter.hasNext()) {
            Subject temp = iter.next();
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n",this.studentName, temp.getSubjectName(), temp.getSubjectScore());
            totalScore += temp.getSubjectScore();
        }
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, totalScore);
    }
}


package com.javapractice03.ex05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 학생 정보를 저장하는 클래스입니다.
 * @author jwon
 */
public class Student {
    /**
     * 학생의 학번입니다.
     */
    private int studentID;
    /**
     * 학생의 이름입니다.
     */
    private String studentName;
    /**
     * 학생이 수강한 과목의 ArrayList입니다.
     */
    private ArrayList<Subject> subjects;

    /**
     * 초기화 블록을 이용한 subjectList의 초기화
     */
    {
        this.subjects = new ArrayList<>();
    }

    /**
     * 학생의 학번과 이름을 매개변수로 받는 생성자입니다.
     * @param studentID 학생의 학번입니다.
     * @param studentName 학생의 이름입니다.
     */
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    /**
     * 학생이 수강한 과목의 ArrayList인 subjectList에 요소를 추가하는 메서드입니다.
     * @param subjectName 과목 이름입니다.
     * @param subjectScore 과목 점수입니다.
     */
    public void addSubject(String subjectName, int subjectScore) {
        subjects.add(new Subject(subjectName, subjectScore));
    }

    /**
     * 학생이 수강한 모든 과목의 성적과 총점을 출력하기 위한 메서드입니다.
     */
    public void showStudentInfo() { // ver1. hand-writing index
        int totalScore = 0;

        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = (Subject)subjects.get(i);
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n", this.studentName, subject.getSubjectName(), subject.getSubjectScore());
            totalScore += subject.getSubjectScore();
        }
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, totalScore);
    }

    public void showStudentInfo2() { // ver2. iterator
        int totalScore = 0;
        Iterator<Subject> iterator = null;

        for (iterator = subjects.iterator(); iterator.hasNext(); ) {
            Subject subject = (Subject)iterator.next();
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n", this.studentName, subject.getSubjectName(), subject.getSubjectScore());
            totalScore += subject.getSubjectScore();
        }
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, totalScore);
    }

    public void showStudentInfo3() { // ver3. enhanced for loop
        int totalScore = 0;

        for (Subject subject : subjects) {
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n", this.studentName, subject.getSubjectName(), subject.getSubjectScore());
            totalScore += subject.getSubjectScore();
        }
        System.out.printf("학생 %s의 총점은 %d입니다.\n", this.studentName, totalScore);
    }
}


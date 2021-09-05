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
    private ArrayList<Subject> subjectList;

    /**
     * 초기화 블록을 이용한 subjectList의 초기화
     */
    {
        this.subjectList = new ArrayList<>();
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
        subjectList.add(new Subject(subjectName, subjectScore));
    }

    /**
     * 학생이 수강한 모든 과목의 성적과 총점을 출력하기 위한 메서드입니다.
     */
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


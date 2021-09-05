package com.javapractice03.ex05;

/**
 * 과목 정보를 저장하는 클래스입니다.
 */
public class Subject {
    /**
     * 과목 이름입니다.
     */
    private String subjectName;
    /**
     * 과목 점수입니다.
     */
    private int subjectScore;

    /**
     * 과목 이름과 점수를 매개변수로 받는 생성자입니다.
     * @param subjectName
     * @param subjectScore
     */
    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    /**
     * @return 과목 이름
     */
    public String getSubjectName() {
        return this.subjectName;
    }

    /**
     * @return 과목 점수
     */
    public int getSubjectScore() {
        return this.subjectScore;
    }
}

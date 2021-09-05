package com.javapractice03.ex01;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(Student.getSerialNum()); //serialNum 값 가져오기 위해 get 메서드 호출
        System.out.println(studentLee.getStudentName() + " 학번:" + studentLee.getStudentID()); // 클래스 이름으로 직접 호출

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.getStudentName() + " 학번:" + studentSon.getStudentID());
    }
}


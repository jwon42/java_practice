package com.javapractice01.ex03;

public class Student {
    // Variable
    private int id;
    private String name;
    private int grade;

    // Constructor
    public Student() {}
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void printInfo() {
        System.out.println("학번 : " + this.id);
        System.out.println("이름 : " + this.name);
        System.out.println("학년 : " + this.grade + "학년");
    }
}

package com.javapractice02.ex03;

public class Subject {
    // Property
    private String name;
    private int score;

    // Default Constructor
    public Subject() {}

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
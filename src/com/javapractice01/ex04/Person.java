package com.javapractice01.ex04;

public class Person {
    // Variable
    private String name;
    private int age;
    private Gender gender;
    private boolean isMarried;
    private int numOfChildren;

    // Constructor
    public Person(String name, int age, Gender gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }
    public Person(String name, int age, Gender gender, boolean isMarried, int numOfChildren) {
        this(name, age, gender);
        this.isMarried = isMarried;
        setNumOfChildren(numOfChildren);
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException();
        }
        this.age = age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public void setNumOfChildren(int numOfChildren) {
        if (numOfChildren < 0) {
            throw new RuntimeException();
        }
        this.numOfChildren = numOfChildren;
    }

    // Method
    private String isMarriedToString() {
        if (this.isMarried == true) {
            return "기혼자";
        }
        return "미혼자";
    }

    public void printInfo() {
        System.out.printf("이름은 %s이고 나이는 %d살 입니다.\n", this.name, this.age);
        System.out.printf("성별은 %s이며, %s입니다. ", this.gender.toString(), isMarriedToString());
        if (this.numOfChildren > 0) {
            System.out.printf("자녀는 %d명 있습니다.\n", this.numOfChildren);
        } else {
            System.out.println("자녀는 없습니다.");
        }
    }
}

enum Gender {
    MALE {
        @Override
        public String toString() {
            return "남성";
        }
    },
    FEMALE {
        @Override
        public String toString() {
            return "여성";
        }
    },
}

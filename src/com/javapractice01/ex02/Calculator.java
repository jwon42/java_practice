package com.javapractice01.ex02;

import java.util.Collections;

public class Calculator {
    // Variable
    private long number1;
    private long number2;

    // Constructor
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Method
    public long add() {
        return this.number1 + this.number2;
    }
    public long subtract() {
        return this.number1 - this.number2;
    }
    public long multiply() {
        return this.number1 * this.number2;
    }
    public double divide() {
        return (double)this.number1 / (double)this.number2;
    }
    public long remainder() {
        return this.number1 % this.number2;
    }

    public void printResult() {
        System.out.printf("첫 번째 숫자 %d, 두 번째 숫자 %d로 연산을 진행합니다.\n", this.number1, this.number2);
        System.out.println(String.join("", Collections.nCopies(42, "-")));
        System.out.printf("%d + %d = %d\n", this.number1, this.number2, add());
        System.out.printf("%d - %d = %d\n", this.number1, this.number2, subtract());
        System.out.printf("%d * %d = %d\n", this.number1, this.number2, multiply());
        if (this.number2 == 0) {
            System.out.printf("%d / %d = 계산 불가\n", this.number1, this.number2);
        } else {
            if (remainder() == 0) {
                System.out.printf("%d / %d = %d\n", this.number1, this.number2, (long)divide());
            } else {
                System.out.printf("%d / %d = %.2f\n", this.number1, this.number2, divide());
            }
        }
        System.out.println(String.join("", Collections.nCopies(42, "-")));
    }
}

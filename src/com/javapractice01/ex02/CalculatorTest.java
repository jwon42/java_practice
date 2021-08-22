package com.javapractice01.ex02;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {
    private static void test() {
        int number1 = 0;
        int number2 = 0;
        Scanner inputNumber = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("첫 번째 숫자를 입력하세요.");
                number1 = inputNumber.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("-2,147,483,648 ~ 2,147,483,647 범위의 정수만 입력할 수 있습니다.");
                inputNumber.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("두 번째 숫자를 입력하세요.");
                number2 = inputNumber.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("-2,147,483,648 ~ 2,147,483,647 범위의 정수만 입력할 수 있습니다.");
                inputNumber.nextLine();
            }
        }

        Calculator calculatorTest = new Calculator(number1, number2);
        calculatorTest.printResult();
    }
    public static void main(String[] args) {
        boolean working = true;
        Scanner inputCommand = new Scanner(System.in);

        System.out.println("2. 사칙연산 테스트");
        System.out.println(String.join("", Collections.nCopies(70, "-")));
        System.out.println("두 수를 차례대로 입력하면 사칙연산의 결과를 제공합니다.");
        System.out.println("정수만 입력 가능하며 나누기 연산의 경우 반올림 후 소숫점 두번째 자리까지 표현됩니다.");
        System.out.println(String.join("", Collections.nCopies(70, "-")));

        while (working) {
            System.out.println("명령어를 입력하세요. ex) START -> 숫자 입력 모드, EXIT -> 프로그램 종료)");
            String command = inputCommand.next();
            switch(command) {
                case "START" :
                    test();
                    break;
                case "EXIT" :
                    working = false;
                    break;
                default :
                    System.out.println("올바르지 않은 명령어입니다.");
                    continue;
            }
        }
    }
}

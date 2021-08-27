package com.javapractice02.ex02;

import java.util.Collections;

public class ThisTest {
    public static void main(String[] args) {
        System.out.println(String.join("", Collections.nCopies(70, "-")));
        System.out.println("1. 자기 자신의 인스턴스 주소를 가리키는 this");
        This first = new This();
        first.firstTest();
        System.out.println(String.join("", Collections.nCopies(70, "-")));

        System.out.println("2. 생성자에서 다른 생성자를 호출하는 this");
        This second = new This(1, true, "HelloWorld");
        System.out.println(second.getTestNumber());
        System.out.println(second.getTestBoolean());
        System.out.println(second.getTestString());
        System.out.println(String.join("", Collections.nCopies(70, "-")));

        System.out.println("3. 자기 자신을 반환하는 this");
        System.out.println(first.returnMySelf());
        System.out.println(second.returnMySelf().getTestNumber());
        System.out.println(second.returnMySelf().getTestBoolean());
        System.out.println(second.returnMySelf().getTestString());
        System.out.println(String.join("", Collections.nCopies(70, "-")));

    }
}

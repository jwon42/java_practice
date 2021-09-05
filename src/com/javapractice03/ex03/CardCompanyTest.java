package com.javapractice03.ex03;

public class CardCompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();

        Card myCard = company.createCard(); // 메서드에서 Card 생성
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber()); // 10001
        System.out.println(yourCard.getCardNumber()); // 10002 출력
    }
}
package com.javapractice04.ex05;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        System.out.println("====== 고객 정보 출력 ======");
        Customer customerLee = new Customer("이순신");
        System.out.println(customerLee.showCustomerInfo());
        Customer customerShin = new Customer("신사임당");
        System.out.println(customerShin.showCustomerInfo());
        GOLDCustomer customerHong = new GOLDCustomer("홍길동");
        System.out.println(customerHong.showCustomerInfo());
        GOLDCustomer customerLee2 = new GOLDCustomer("이율곡");
        System.out.println(customerLee2.showCustomerInfo());
        VIPCustomer customerKim2 = new VIPCustomer("김유신", 12345);
        System.out.println(customerKim2.showCustomerInfo());

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerLee2);
        customerList.add(customerKim2);

        for (Customer customer : customerList) {
            int price = customer.calcPrice(10000);
            System.out.printf("%s 님이 %d원 지불하셨습니다.\n", customer.customerName, price);
            System.out.printf("%s 님의 현재 보너스 포인트는 %d점입니다.\n", customer.customerName, customer.bonusPoint);
        }
    }
}
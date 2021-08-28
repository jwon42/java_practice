package com.javapractice02.ex04;

public class CoffeeBean {
    // Property
    private String cafeName;
    private int revenue;
    private int priceOfCafeLatte;

    // Initialization Block
    {
        this.cafeName = "커피빈";
        this.priceOfCafeLatte = 4000;
    }

    // Getter
    public String getCafeName() {
        return this.cafeName;
    }

    public int getPriceOfCafeLatte() {
        return this.priceOfCafeLatte;
    }

    // Method
    public void sellCafeLatte() {
        this.revenue += this.priceOfCafeLatte;
    }
}

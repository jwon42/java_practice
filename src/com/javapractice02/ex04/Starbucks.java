package com.javapractice02.ex04;

public class Starbucks {
    // Property
    private String cafeName;
    private int revenue;
    private int priceOfAmericano;

    // Initialization Block
    {
        this.cafeName = "스타벅스";
        this.priceOfAmericano = 3000;
    }

    // Getter
    public String getCafeName() {
        return this.cafeName;
    }

    public int getPriceOfAmericano() {
        return this.priceOfAmericano;
    }

    // Method
    public void sellAmericano() {
        this.revenue += this.priceOfAmericano;
    }
}

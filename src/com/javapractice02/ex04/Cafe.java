package com.javapractice02.ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Cafe {
    // Property
    private String cafeName;
    private int revenue;
    private ArrayList<Menu> menuList;

    // Initialization Block
    {
        this.menuList = new ArrayList<>();
    }

    // Constructor
    public Cafe(String cafeName) {
        this.cafeName = cafeName;
    }

    // Getter
    public String getCafeName() {
        return this.cafeName;
    }

    // Method
    public void addMenu(String name, int price) {
        menuList.add(new Menu(name, price));
    }

    public void sellCoffee(String menuName) {
        this.revenue += getCoffeePrice(menuName);
    }

    public int getCoffeePrice(String menuName) {
        Iterator<Menu> iter = menuList.iterator();
        while (iter.hasNext()) {
            Menu temp = iter.next();
            if (Objects.equals(temp.getName(), menuName)) {
                return temp.getPrice();
            }
        }
        return 0;
    }
}

class Menu {
    // Property
    private String name;
    private int price;

    // Constructor
    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
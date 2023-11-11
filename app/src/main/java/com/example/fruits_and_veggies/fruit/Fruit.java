package com.example.fruits_and_veggies.fruit;

public class Fruit {
    private final String name;
    private final double price;
    private final int quantity;
    private final double sweetIndex;

    public Fruit(String name, double price, int quantity, double sweetIndex) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sweetIndex = sweetIndex;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSweetIndex() {
        return sweetIndex;
    }
}

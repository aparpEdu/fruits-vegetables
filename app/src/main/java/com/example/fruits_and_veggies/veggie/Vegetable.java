package com.example.fruits_and_veggies.veggie;

public class Vegetable {
    private final String name;
    private final double price;
    private int quantity;

    public Vegetable(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

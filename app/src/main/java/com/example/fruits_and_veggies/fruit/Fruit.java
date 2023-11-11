package com.example.fruits_and_veggies.fruit;

import com.example.fruits_and_veggies.item.Item;

public class Fruit implements Item {
    private final String name;
    private final double price;
    private int quantity;
    private final double sweetIndex;

    public Fruit(String name, double price, int quantity, double sweetIndex) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sweetIndex = sweetIndex;
    }



    public double getSweetIndex() {
        return sweetIndex;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

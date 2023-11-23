package com.example.fruits_and_veggies.veggie;

import com.example.fruits_and_veggies.item.Item;

public class Vegetable implements Item {
    private final String name;
    private final double price;
    private int quantity;
    private final String image;

    public Vegetable(String name, double price, int quantity, String image) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
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
    public String getImage() {
        return image;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

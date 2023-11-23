package com.example.fruits_and_veggies.fruit;

import com.example.fruits_and_veggies.item.Item;

public class Fruit implements Item {
    private final String name;
    private final double price;
    private int quantity;
    private final double sweetIndex;
    private final String image;

    public Fruit(String name, double price, int quantity, double sweetIndex, String image) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sweetIndex = sweetIndex;
        this.image = image;
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
    public String getImage() {return image;}

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

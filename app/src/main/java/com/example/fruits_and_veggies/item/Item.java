package com.example.fruits_and_veggies.item;

public interface Item {
    String getName();
    double getPrice();
    int getQuantity();
    String getImage();
    void setQuantity(int quantity);
}

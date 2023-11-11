package com.example.fruits_and_veggies.fruit;

import java.util.List;

public class FruitSource {
    private static FruitSource instance = null;
    private final List<Fruit> fruits;

    private FruitSource() {
        this.fruits = FruitLoader.loadFruits();
    }

    public static FruitSource getInstance(){
        if(instance == null){
            instance = new FruitSource();
        }
        return instance;
    }
    public List<Fruit> getFruits() {
        return fruits;
    }
}

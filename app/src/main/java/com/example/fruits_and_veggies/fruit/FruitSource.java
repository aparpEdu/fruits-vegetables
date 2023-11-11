package com.example.fruits_and_veggies.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitSource {
    public static List<Fruit> loadFruits(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 20, 2, 2.5));
        fruits.add(new Fruit("Peer", 22, 3, 2.4));
        fruits.add(new Fruit("Banana", 23, 4, 2.8));
        return fruits;
    }
}

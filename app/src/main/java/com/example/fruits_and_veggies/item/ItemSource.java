package com.example.fruits_and_veggies.item;

import com.example.fruits_and_veggies.fruit.FruitSource;
import com.example.fruits_and_veggies.veggie.VegetableSource;

import java.util.ArrayList;
import java.util.List;

public class ItemSource {
    public static List<Item> loadItems(){
        List<Item> items = new ArrayList<>();
        items.addAll(VegetableSource.loadVegetables());
        items.addAll(FruitSource.loadFruits());
        return items;
    }
}

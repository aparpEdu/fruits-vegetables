package com.example.fruits_and_veggies.veggie;

import java.util.ArrayList;
import java.util.List;

public class VegetableLoader {
    public static List<Vegetable> loadVegetables(){
        List<Vegetable> vegetables  = new ArrayList<>();
        vegetables.add(new Vegetable("Cucumber", 20, 4));
        vegetables.add(new Vegetable("Onion", 22, 3));
        vegetables.add(new Vegetable("Cucumber", 28, 4));
        return vegetables;
    }
}

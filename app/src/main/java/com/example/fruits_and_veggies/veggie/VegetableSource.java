package com.example.fruits_and_veggies.veggie;

import java.util.List;

public class VegetableSource {
    private static VegetableSource instance = null;
    private final List<Vegetable> vegetables;

    public VegetableSource() {
        this.vegetables = VegetableLoader.loadVegetables();
    }

    public static VegetableSource getInstance() {
        if(instance == null) {
            instance = new VegetableSource();
        }
        return instance;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }
}

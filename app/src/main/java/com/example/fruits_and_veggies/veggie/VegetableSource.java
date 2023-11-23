package com.example.fruits_and_veggies.veggie;

import java.util.ArrayList;
import java.util.List;

public class VegetableSource {
    public static List<Vegetable> loadVegetables(){
        List<Vegetable> vegetables  = new ArrayList<>();
        vegetables.add(new Vegetable("Cucumber", 20, 4, "https://www.simplyrecipes.com/thmb/29GFeBZVaGjvvYFYGd-fM9IG77o=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Simply-Recipes-Waxy-Cucumbers-LEAD-f46dbda3d589434ab63a3b50b7cbd94c.jpg"));
        vegetables.add(new Vegetable("Onion", 22, 3, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Onion_on_White.JPG/1200px-Onion_on_White.JPG"));
        vegetables.add(new Vegetable("Carrot", 28, 4, "https://www.alimentarium.org/sites/default/files/media/image/2016-10/AL012-02%20carotte_0.jpg"));
        return vegetables;
    }
}

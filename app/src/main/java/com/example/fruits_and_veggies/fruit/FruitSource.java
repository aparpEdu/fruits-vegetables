package com.example.fruits_and_veggies.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitSource {
    public static List<Fruit> loadFruits(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 20, 2, 2.5, "https://www.applesfromny.com/wp-content/uploads/2020/05/20Ounce_NYAS-Apples2.png"));
        fruits.add(new Fruit("Peer", 22, 3, 2.4, "https://www.indianonshop.com/wp-content/uploads/2022/06/Peer.jpg"));
        fruits.add(new Fruit("Banana", 23, 4, 2.8, "https://th-thumbnailer.cdn-si-edu.com/xK6NAJHiv_51fzn5sDiQt0eD5Is=/fit-in/1600x0/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/d5/24/d5243019-e0fc-4b3c-8cdb-48e22f38bff2/istock-183380744.jpg"));
        return fruits;
    }
}

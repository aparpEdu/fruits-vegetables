package com.example.fruits_and_veggies;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.fruit.Fruit;
import com.example.fruits_and_veggies.item.Item;
import com.example.fruits_and_veggies.item.ItemAdapter;
import com.example.fruits_and_veggies.item.ItemSource;
import com.example.fruits_and_veggies.item.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        Button button  = findViewById(R.id.randomQntBtn);
        ItemAdapter itemAdapter = new ItemAdapter(ItemSource.loadItems(),  this);
        recyclerView.setAdapter(itemAdapter);
        Log.d("test", String.valueOf(Objects.requireNonNull(recyclerView.getAdapter()).getItemCount()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        button.setOnClickListener(view -> {
            Random random = new Random();
            List<Item> items = ItemSource.loadItems();
            for (int i = 0; i < items.size(); i++) {
                int newQuantity = random.nextInt(100);
                items.get(i).setQuantity(newQuantity);
                itemAdapter.updateItem(i, items.get(i));
            }
        });


    }

    @Override
    public void onItemClick(int position) {
        ItemAdapter itemAdapter = (ItemAdapter) recyclerView.getAdapter();
        if (itemAdapter != null) {
            Item clickedItem = itemAdapter.getItem(position);
            Bundle bundle = new Bundle();
            bundle.putString("name", clickedItem.getName());
            bundle.putString("price", clickedItem.getPrice() + "");
            bundle.putString("qnt", clickedItem.getQuantity() + "");
            bundle.putString("image", clickedItem.getImage());
            if (clickedItem instanceof Fruit) {
                double sweetness = ((Fruit) clickedItem).getSweetIndex();
                bundle.putString("sweetness", sweetness + "");
            }

            Intent intent = new Intent(getApplicationContext(), ItemActivity.class);
            intent.putExtra("item", bundle);
            startActivity(intent);
        }
    }

}
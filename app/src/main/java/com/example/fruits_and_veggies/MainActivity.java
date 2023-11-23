package com.example.fruits_and_veggies;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.fruit.Fruit;
import com.example.fruits_and_veggies.item.Item;
import com.example.fruits_and_veggies.item.ItemAdapter;
import com.example.fruits_and_veggies.item.ItemSource;
import com.example.fruits_and_veggies.item.OnItemClickListener;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Button button  = findViewById(R.id.randomQntBtn);
        ItemAdapter itemAdapter = new ItemAdapter(ItemSource.loadItems(),  this);
        recyclerView.setAdapter(itemAdapter);
        Log.d("test", String.valueOf(Objects.requireNonNull(recyclerView.getAdapter()).getItemCount()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }

    @Override
    public void onItemClick(int position) {
        Item item = ItemSource.loadItems().get(position);
        Bundle bundle = new Bundle();
        bundle.putString("name", item.getName());
        bundle.putString("price", item.getPrice() + "");
        bundle.putString("qnt", item.getPrice() + "");
        bundle.putString("image", item.getImage());
        if (item instanceof Fruit) {
            double sweetness =  ((Fruit) item).getSweetIndex();
            bundle.putString("sweetness", sweetness +"");
        }
        Intent intent = new Intent(getApplicationContext(), ItemActivity.class);
        intent.putExtra("item", bundle);
        startActivity(intent);
    }
}
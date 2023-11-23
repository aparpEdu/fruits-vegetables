package com.example.fruits_and_veggies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fruits_and_veggies.item.Item;
import com.squareup.picasso.Picasso;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        ImageView imageView = findViewById(R.id.itemPicture);
        Button back  = findViewById(R.id.backBtn);
        TextView name = findViewById(R.id.itemName);
        TextView price = findViewById(R.id.itemPrice);
        TextView quantity = findViewById(R.id.itemQuantity);
        TextView sweetness = findViewById(R.id.itemSweetness);
        Bundle item = getIntent().getBundleExtra("item");
        if (item != null) {
            name.setText(item.getString("name", ""));
            price.setText(item.getString("price", ""));
            quantity.setText(item.getString("qnt", ""));
            sweetness.setText(item.getString("sweetness", ""));
            Picasso.get().load(item.getString("image", "https://media.post.rvohealth.io/wp-content/uploads/sites/2/2022/05/567521-grt-bananas-1296x728-header_body.jpg"))
                    .into(imageView);
        }
        back.setOnClickListener(view -> finish());
    }
}
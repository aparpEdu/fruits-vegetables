package com.example.fruits_and_veggies.fruit;



import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.R;
import com.example.fruits_and_veggies.item.OnItemClickListener;

public class FruitViewHolder extends RecyclerView.ViewHolder {

    private final TextView nameView;
    private final TextView priceView;
    private final TextView quantityView;
    private final TextView sweetnessView;
    public FruitViewHolder(@NonNull View itemView) {
        super(itemView);
        this.nameView = itemView.findViewById(R.id.fruit_name);
        this.priceView = itemView.findViewById(R.id.fruit_price);
        this.quantityView = itemView.findViewById(R.id.fruit_quantity);
        this.sweetnessView = itemView.findViewById(R.id.fruit_sweetness);
    }

    public void bind(Fruit fruit) {
        Log.d("FruitViewHolder", "bind - Fruit: " + fruit.getName());
        String priceText = "Price: " + fruit.getPrice();
        String quantityText = "Quantity: " + fruit.getQuantity();
        String sweetnessText = "Sweetness: "  + fruit.getSweetIndex();
        nameView.setText(fruit.getName());
        priceView.setText(priceText);
        quantityView.setText(quantityText);
        sweetnessView.setText(sweetnessText);

    }
}

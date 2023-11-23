package com.example.fruits_and_veggies.veggie;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.R;
import com.example.fruits_and_veggies.item.OnItemClickListener;

public class VegetableViewHolder extends RecyclerView.ViewHolder {
    private final TextView nameView;
    private final TextView priceView;
    private final TextView quantityView;

    public VegetableViewHolder(@NonNull View itemView) {
        super(itemView);
        this.nameView = itemView.findViewById(R.id.vegetable_name);
        this.priceView = itemView.findViewById(R.id.vegetable_price);
        this.quantityView = itemView.findViewById(R.id.vegetable_quantity);

    }

    public void bind(Vegetable vegetable) {
        Log.d("VegetableViewHolder", "bind - Vegetable: " + vegetable.getName());
        String priceText = "Price: " + vegetable.getPrice();
        String quantityText = "Quantity: " + vegetable.getQuantity();
        nameView.setText(vegetable.getName());
        priceView.setText(priceText);
        quantityView.setText(quantityText);
    }
}

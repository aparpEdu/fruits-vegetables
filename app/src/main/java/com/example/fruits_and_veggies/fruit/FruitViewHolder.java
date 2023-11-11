package com.example.fruits_and_veggies.fruit;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.item.OnItemClickListener;

public class FruitViewHolder extends RecyclerView.ViewHolder {
    public FruitViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
        super(itemView);

        itemView.setOnClickListener(view -> {
            if (listener != null){
                listener.onItemClick(getBindingAdapterPosition());
            }
        });
    }
}

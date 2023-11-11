package com.example.fruits_and_veggies.veggie;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.item.OnItemClickListener;

public class VegetableViewHolder extends RecyclerView.ViewHolder {
    public VegetableViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
        super(itemView);

        itemView.setOnClickListener(view -> {
            if (listener != null){
                listener.onItemClick(getBindingAdapterPosition());
            }
        });
    }
}

package com.example.fruits_and_veggies.item;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fruits_and_veggies.R;
import com.example.fruits_and_veggies.fruit.Fruit;
import com.example.fruits_and_veggies.fruit.FruitViewHolder;
import com.example.fruits_and_veggies.veggie.Vegetable;
import com.example.fruits_and_veggies.veggie.VegetableViewHolder;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Item> items;
    private final OnItemClickListener listener;

    public ItemAdapter(List<Item> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("ItemAdapter", "onCreateViewHolder - viewType: " + viewType);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            View view = inflater.inflate(R.layout.item_fruit, parent, false);
            return new FruitViewHolder(view);
        }
            View view = inflater.inflate(R.layout.item_vegetable, parent, false);
            return new VegetableViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Fruit){
            return 0;
        }
        return 1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(view -> {
            if (listener != null){
                listener.onItemClick(position);
            }
        });
        Log.d("ItemAdapter", "onBindViewHolder - viewType: " + holder.getItemViewType() + ", position: " + position);
        if (holder instanceof FruitViewHolder) {
            ((FruitViewHolder) holder).bind((Fruit) items.get(position));
        } else if (holder instanceof VegetableViewHolder) {
            ((VegetableViewHolder) holder).bind((Vegetable) items.get(position));
        }
    }

    public void updateItem(int position, Item updatedItem) {
        items.set(position, updatedItem);
        notifyItemChanged(position);
    }

    public Item getItem(int position) {
        if (position >= 0 && position < items.size()) {
            return items.get(position);
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}

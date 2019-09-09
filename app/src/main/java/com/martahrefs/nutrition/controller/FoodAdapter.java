package com.martahrefs.nutrition.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.martahrefs.nutrition.R;
import com.martahrefs.nutrition.model.Food;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    // Member variable for the listener
    private OnItemClickLister mListener;
    // Member variable for the List of Food
    List<Food> mFoodList = new ArrayList<>();

    // Method to get the list of foods into our RecyclerView
    public void setFoodList(List<Food> list) {
        this.mFoodList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        // Reference to the Food Object at this position
        Food currentFood = mFoodList.get(position);
        // Populate the views in the FoodHolder
        holder.mNameTextView.setText(currentFood.getName());
        holder.mTypeTextVeiw.setText(currentFood.getType());
        holder.mImageView.setImageResource(currentFood.getImageResource());
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    // Holder class to hold the single listView
    class FoodHolder extends RecyclerView.ViewHolder {
        private TextView mNameTextView;
        private TextView mTypeTextVeiw;
        private ImageView mImageView;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            mNameTextView = itemView.findViewById(R.id.foodListItemTextView);
            mTypeTextVeiw = itemView.findViewById(R.id.foodListItemTypeTextView);
            mImageView = itemView.findViewById(R.id.foodListItemImage);

            // Set OnClickListener to the CardView same as it's done for buttons
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Position of the note
                    int position = getAdapterPosition();
                    if (mListener != null && position != RecyclerView.NO_POSITION) {
                        mListener.onItemClick(mFoodList.get(position));
                    }
                }
            });
        }
    }

    // Inteface to implement clickReactions
    public interface OnItemClickLister {
        void onItemClick(Food food);
    }

    public void setOnItemClickListener(OnItemClickLister listener) {
        this.mListener = listener;
    }
}

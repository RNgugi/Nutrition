package com.martahrefs.nutrition.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.martahrefs.nutrition.R;
import com.martahrefs.nutrition.controller.FoodAdapter;
import com.martahrefs.nutrition.model.Food;
import com.martahrefs.nutrition.viewmodel.NutritionViewModel;

import java.util.List;

public class FoodListActivity extends AppCompatActivity {
    //Member variable for the ViewModel
    private NutritionViewModel mViewModel;
    //Member variable for the key
    private int mKeyFromMainActivity;

    @BindView(R.id.food_recycler_view) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        // Sets the Toolbar to act as the ActionBar for this Activity window.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        final FoodAdapter mFoodAdapter = new FoodAdapter();
        mRecyclerView.setAdapter(mFoodAdapter);

        // Get the intent from MainActivity
        Intent intent = getIntent();
        mKeyFromMainActivity = intent.getIntExtra(getString(R.string.key_passed),-1);

        // Get ViewModel Instance
        mViewModel = ViewModelProviders.of(this).get(NutritionViewModel.class);
        mViewModel.getAllFood().observe(this, new Observer<List<Food>>() {
            @Override
            public void onChanged(List<Food> foods) {
                // Update RecyclerView
                mFoodAdapter.setFoodList(foods);
            }
        });

        mFoodAdapter.setOnItemClickListener(new FoodAdapter.OnItemClickLister() {
            @Override
            public void onItemClick(Food food) {
                String foodName = food.getName();
                Toast.makeText(FoodListActivity.this, foodName, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

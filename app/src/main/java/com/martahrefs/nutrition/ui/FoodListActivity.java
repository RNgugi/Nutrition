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

import java.util.List;

public class FoodListActivity extends AppCompatActivity {
    //Member variable for the ViewModel
    //Member variable for the key
    private int mKeyFromMainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        // Sets the Toolbar to act as the ActionBar for this Activity window.



    }
}

package com.martahrefs.nutrition.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.martahrefs.nutrition.NotRecommended;
import com.martahrefs.nutrition.R;
import com.martahrefs.nutrition.Recommended;


public class FoodListActivity extends AppCompatActivity {


    Button recommended, not_recommended;

    Fragment fragment;
    FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment = new Recommended();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        setContentView(R.layout.activity_food_list);

        recommended = (Button) findViewById(R.id.recommended);
        recommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new Recommended();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }
        });

        not_recommended = (Button) findViewById(R.id.not_recommended);
        not_recommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new NotRecommended();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }
        });


    }
}
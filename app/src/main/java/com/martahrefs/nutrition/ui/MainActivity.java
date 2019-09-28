package com.martahrefs.nutrition.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.martahrefs.nutrition.R;

public class MainActivity extends AppCompatActivity {

    CardView foodCard;

    public static final int FOOD_FLAG = 1;
    public static final int DISEASE_FLAG = 2;
    public static final int PRODUCTS_FLAG = 3;
    public static final int GET_HELP_FLAG = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodCard=(CardView)findViewById(R.id.foodCard);
        foodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), FoodListActivity.class);
                startActivity(intent);
            }
        });

        /* Bind view with ButterKnife */
        ButterKnife.bind(this);

    }

    @OnClick(R.id.diseaseCard) void startDiseaseList(){
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.key_passed),DISEASE_FLAG);
        startActivity(intent);
    }

    //Onclick listeners with ButterKnife annotation
    /*@OnClick(R.id.foodCard) void startFoodList(){
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.key_passed),FOOD_FLAG);
        startActivity(intent);
    }*/
}

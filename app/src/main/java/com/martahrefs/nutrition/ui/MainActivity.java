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
import android.widget.TextView;

import com.martahrefs.nutrition.R;

public class MainActivity extends AppCompatActivity {


    CardView foodCard;


    private FactBook mFactbook;
    private CardView mFoodCard;
    private CardView mDiseaseCard;
    private Button mRefreshButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoodCard = findViewById(R.id.foodCard);
        mDiseaseCard = findViewById(R.id.diseaseCard);
        mRefreshButton = findViewById(R.id.refreshButton);

        // Get a random fact and update textView
        mFact = mFactbook.getRandomFact();
        mFunTextView.setText(mFact);


        mRefreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFact = mFactbook.getRandomFact();
                mFunTextView.setText(mFact);
            }
        });

        mFoodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FoodListActivity.class);
                startActivity(intent);
            }
        });

        mDiseaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DiseaseListActivity.class);
                startActivity(intent);
            }
        });


        foodCard=(CardView)findViewById(R.id.foodCard);
        foodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), FoodListActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.martahrefs.nutrition.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.martahrefs.nutrition.R;

public class MainActivity extends AppCompatActivity {

    private FactBook mFactbook = new FactBook();
    private CardView mFoodCard;
    private CardView mGetHelpCard;
    private CardView mForumCard;
    private CardView mDiseaseCard;
    private Button mRefreshButton;
    private String mFact;
    private TextView mFunTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        mFoodCard = findViewById(R.id.foodCard);
        mDiseaseCard = findViewById(R.id.diseaseCard);
        mRefreshButton = findViewById(R.id.refreshButton);
        mForumCard = findViewById(R.id.forumCard);
        mGetHelpCard = findViewById(R.id.getHelpCard);


        // Get a random fact and update textView
        mFact = mFactbook.getRandomFact();
        mFunTextView=(TextView)findViewById(R.id.factTextView);
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
    }
}

package com.martahrefs.nutrition.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.martahrefs.nutrition.R;

public class MainActivity extends AppCompatActivity {
    private FactBook mFactbook;
    private String mFact = mFactbook.getRandomFact();
    @BindView(R.id.factTextView) TextView mFunTextView;

    //Onclick listeners with ButterKnife annotation
    @OnClick(R.id.foodCard) void startFoodList(){
        Intent intent = new Intent(this,FoodListActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.diseaseCard) void startDiseaseList(){
        Intent intent = new Intent(this,DiseaseListActivity.class);

    }

    @OnClick(R.id.refreshButton) void nextFact(){
        mFact = mFactbook.getRandomFact();
        mFunTextView.setText(mFact);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFact = mFactbook.getRandomFact();

        /* Bind view with ButterKnife */
        ButterKnife.bind(this);

    }
}

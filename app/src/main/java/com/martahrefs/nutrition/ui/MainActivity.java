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

import com.martahrefs.nutrition.R;

public class MainActivity extends AppCompatActivity {

    //Declare views with ButterKnife
    @BindView(R.id.refreshButton) Button mRefreshButton;
    @BindView (R.id.productsCard) CardView mProductsCard;
    @BindView (R.id.consultationCard) CardView mGetHelpCard;

    public static final int FOOD_FLAG = 1;
    public static final int DISEASE_FLAG = 2;
    public static final int PRODUCTS_FLAG = 3;
    public static final int GET_HELP_FLAG = 4;

    //Onclick listeners with ButterKnife annotation
    @OnClick(R.id.foodCard) void startFoodList(){
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.key_passed),FOOD_FLAG);
        startActivity(intent);
    }

    @OnClick(R.id.diseaseCard) void startDiseaseList(){
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.key_passed),DISEASE_FLAG);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Bind view with ButterKnife */
        ButterKnife.bind(this);


        // Sets the Toolbar to act as the ActionBar for this Activity window.
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		// Remove default title text
		getSupportActionBar().setDisplayShowTitleEnabled(false);

    }
}

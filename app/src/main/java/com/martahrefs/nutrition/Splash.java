package com.martahrefs.nutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    TextView title1;
    Typeface tp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        title1=(TextView)findViewById(R.id.splash_title);
        tp1= Typeface.createFromAsset(getAssets(), "fonts/QuickKiss.ttf");
        title1.setTypeface(tp1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}

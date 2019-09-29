package com.martahrefs.nutrition;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class Recommended extends Fragment {


    public Recommended() {
        // Required empty public constructor
    }
    

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10;
    CardView cardView11, cardView12, cardView13, cardView14, cardView15;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View my_recommended=inflater.inflate(R.layout.fragment_recommended__products, container, false);


        // custom dialog
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_dialogbox);
        dialog.setTitle("Title...");

        // if button is clicked, close the custom dialog
        /*Button dialogButton = (Button) my_recommended.findViewById(R.id.dialogButtonOK);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });*/


        //CardView 1
        cardView1=(CardView)my_recommended.findViewById(R.id.cardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.oatmeal);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.oatmeal);
                dialog.show();
            }
        });


        //CardView 2
        cardView2=(CardView)my_recommended.findViewById(R.id.cardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // set the custom dialog components - text, image and button
                TextView text = (TextView)dialog.findViewById(R.id.text);
                text.setText("");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.brown_rice);
                dialog.show();
            }
        });


        //CardView 3
        cardView3=(CardView)my_recommended.findViewById(R.id.cardView3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.kales);
                dialog.show();
            }
        });


        //CardView 4
        cardView4=(CardView)my_recommended.findViewById(R.id.cardView4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView)dialog.findViewById(R.id.text);
                text.setText(R.string.millet);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.millet);
                dialog.show();
            }
        });


        //CardView 5
        cardView5=(CardView)my_recommended.findViewById(R.id.cardView5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.spinach);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.spinach);
                dialog.show();
            }
        });


        //CardView 6
        cardView6=(CardView)my_recommended.findViewById(R.id.cardView6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.grapes);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.grapes);
                dialog.show();
            }
        });


        //CardView 7
        cardView7=(CardView)my_recommended.findViewById(R.id.cardView7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.apples);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.apple);
                dialog.show();
            }
        });


        //CardView 8
        cardView8=(CardView)my_recommended.findViewById(R.id.cardView8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom dialog
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.custom_dialogbox);
                dialog.setTitle("French Fries");

                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.watermelons);
                ImageView image = (ImageView)dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.watermelon);
                dialog.show();
            }
        });


        //CardView 9
        cardView9=(CardView)my_recommended.findViewById(R.id.cardView9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.papaya);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.papaya);
                dialog.show();
            }
        });


        //CardView 10
        cardView10=(CardView)my_recommended.findViewById(R.id.cardView10);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.oranges);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.orange_holder);
                dialog.show();
            }
        });
        
        return  my_recommended;
    }
          

}

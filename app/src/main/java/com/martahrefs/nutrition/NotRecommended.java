package com.martahrefs.nutrition;


import android.app.Dialog;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class NotRecommended extends Fragment {


    public NotRecommended() {
        // Required empty public constructor
    }

    CardView cardView11, cardView12, cardView13, cardView14, cardView15;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View my_recommended=inflater.inflate(R.layout.fragment_not_recommended, container, false);

        // custom dialog
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_dialogbox);
        dialog.setTitle("Title...");

        //CardView 11
        cardView11=(CardView)my_recommended.findViewById(R.id.cardView11);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView)dialog.findViewById(R.id.text);
                text.setText(R.string.white_rice);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.white_rice_holder);
                dialog.show();
            }
        });


        //CardView 12
        cardView12=(CardView)my_recommended.findViewById(R.id.cardView12);
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.white_bread);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.white_bread);
                dialog.show();
            }
        });


        //CardView 13
        cardView13=(CardView)my_recommended.findViewById(R.id.cardView13);
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(R.string.french_fries);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.french_fries);
                dialog.show();
            }
        });



        return my_recommended;
    }

}

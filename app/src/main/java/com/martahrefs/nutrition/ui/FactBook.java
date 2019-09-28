package com.martahrefs.nutrition.ui;

import java.util.Random;

public class FactBook {
    String[] facts = {
            "Diabetes is a condition characterised by too high or too low blood sugar",
            "There are five types of Diabetes",
            "Diabetes can be hereditary or as a result of one's lifestyele",
            "Hereditary Diabetes is insulin dependent",
            "Insulin allows absorbed sugars from the blood into cells",
            "Obesity leads to insulin resistance",
            "Pre-deabetes is high blood sugar but not hight enough to be rendered as Diabetes",
            "The pancrease is the organ responsible for making insulin",
            "Unregulated Diabetes in men can led to Erectyle Dysfunction in men and reduced sex drive",
            "Unregulated Diabetes in women leads to persitent yeast infects in urinary tract and vaginal tract"
    };

    public String getRandomFact(){
        Random random = new Random();
        int randomNumber = random.nextInt(facts.length+1);
        String fact = facts[randomNumber];
        return fact;
    }

}

package com.martahrefs.nutrition.model;

import android.content.Context;
import android.os.AsyncTask;

import com.martahrefs.nutrition.R;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Disease.class,Food.class,Product.class},version = 1)
public abstract class NutritionDatabase extends RoomDatabase {

    // Create an instance of the Database to turn the class into a Singleton
    private static NutritionDatabase instance;

    // Give the DAOs access to the Database
    public abstract FoodDao mFoodDao();
    public abstract DiseaseDao mDiseaseDao();
    public abstract ProductDao mProductDao();

    // Method returns an instance of the Database
    public static synchronized NutritionDatabase getInstance(Context context){
        // Creates a new instance of the database if null
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),NutritionDatabase.class,"nutritioin_database")
                    .fallbackToDestructiveMigration().addCallback(roomCallback).build();
        }
        // Returns the already existing instance of the database
        return instance;
    }

    // Populate the database with data on first create
    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            //Run the Asnychronous task
            new PopulateDbAsync(instance).execute();
        }
    };

    // The above task(Inserting data the first time the database is crated has to be done in an Asynchronous task
    private static class PopulateDbAsync extends AsyncTask<Void,Void,Void>{
        private FoodDao foodDao;
        private DiseaseDao diseaseDao;
        private ProductDao productDao;

        private PopulateDbAsync (NutritionDatabase db){
            foodDao = db.mFoodDao();
            diseaseDao = db.mDiseaseDao();
            productDao = db.mProductDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            // Insert into Food table
            foodDao.insertFood(new Food("Chia","Seeds", R.drawable.chiaseeds,"These are seeds from the Chia plant","It's good for the soul","Take with hot Water"));
            foodDao.insertFood(new Food("Coffee","Beverage", R.drawable.coffee,"Made from Coffee plant berries","Super nice especially when taken in the morning","Brew a cup of hot coffee, and see your day transform"));
            
            // Insert into Disease table
            diseaseDao.insertDisease(new Disease("Anaemia","Caused by lack of Iron in the blood","Lots of papaya and green vegetables would help"));

            // Insert into Disease Table
            // TODO
            return null;
        }
    }
}

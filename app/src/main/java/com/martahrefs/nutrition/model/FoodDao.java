package com.martahrefs.nutrition.model;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface FoodDao {
    //Read from the Database Food table with LiveData
    @Query("SELECT * FROM food_table ORDER BY name_column ASC")
    LiveData<List<Food>> getAllFoods();

    //Insert into the Database Food table
    @Insert
    void insertFood(Food food);

}

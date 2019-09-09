package com.martahrefs.nutrition.model;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DiseaseDao {
    //Read all colums from the Disease_table using LiveData
    @Query("SELECT * FROM diseases_table ORDER BY name_column ASC")
    LiveData<List<Disease>> getAllDiseases();

    //Insert a disease into the table
    @Insert
    void insertDisease(Disease disease);
}

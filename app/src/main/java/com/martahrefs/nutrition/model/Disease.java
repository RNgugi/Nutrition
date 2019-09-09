package com.martahrefs.nutrition.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "diseases_table")
public class Disease {
    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo(name = "name_column")
    private String mName;

    @ColumnInfo(name = "description_column")
    private String mDescription;

    @ColumnInfo(name = "nutrition_column")
    private  String mNutrition;

    // Single Disease Constructor
    public Disease(String name, String description, String nutrition) {
        mName = name;
        mDescription = description;
        mNutrition = nutrition;
    }

    // Setter for the id to be used by Room during Runtime
    public void setId(int id) {
        mId = id;
    }

    // Getters for the sake of encapsulation

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getNutrition() {
        return mNutrition;
    }
}

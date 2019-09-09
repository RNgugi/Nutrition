package com.martahrefs.nutrition.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "food_table")
public class Food {
    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo(name = "name_column")
    private String mName;

    @ColumnInfo(name = "type_column")
    private String mType;

    @ColumnInfo(name = "imageResource_column")
    private int mImageResource;

    @ColumnInfo(name = "description_column")
    private String mDescription;

    @ColumnInfo(name = "healthBenefits_column")
    private String mHealthBenefits;

    @ColumnInfo(name = "preparation_column")
    private String mPreparation;

    // Constructor for a Single Food Object
    public Food(String name, String type, int imageResource, String description, String healthBenefits, String preparation) {
        mName = name;
        mType = type;
        mImageResource = imageResource;
        mDescription = description;
        mHealthBenefits = healthBenefits;
        mPreparation = preparation;
    }

    // Setter for the id to be used by the Room Library on runtime
    public void setId(int id) {
        mId = id;
    }

    // Getters for the sake of encapsulation
    public String getName() {
        return mName;
    }

    public String getType() {
        return mType;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getHealthBenefits() {
        return mHealthBenefits;
    }

    public String getPreparation() {
        return mPreparation;
    }
}

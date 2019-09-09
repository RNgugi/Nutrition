package com.martahrefs.nutrition.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "products_table")
public class Product {
    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo(name = "name_column")
    private String mName;

    @ColumnInfo(name = "imageResource_column")
    private int mImageResource;

    @ColumnInfo(name = "price_column")
    private int mPrice;

    @ColumnInfo(name = "description_column")
    private String mDescription;

    // Constructor for a single product object
    public Product(int imageResource, int price, String description) {
        mImageResource = imageResource;
        mPrice = price;
        mDescription = description;
    }

    // Setter for the id to be used by room during Runtime
    public void setId(int id) {
        mId = id;
    }

    // Getters for the sake of encapsulation
    public int getImageResource() {
        return mImageResource;
    }

    public int getPrice() {
        return mPrice;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }
}

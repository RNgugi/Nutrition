package com.martahrefs.nutrition.model;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ProductDao {
    // Read all products from the Products Table using LiveData
    @Query("SELECT * FROM products_table ORDER BY name_column ASC")
    LiveData<List<Product>> getAllProducts();

    // Insert a new Product in to the Table
    @Insert
    void insertProduct(Product product);
}

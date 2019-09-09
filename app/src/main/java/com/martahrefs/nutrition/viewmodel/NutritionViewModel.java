package com.martahrefs.nutrition.viewmodel;

import android.app.Application;

import com.martahrefs.nutrition.model.Disease;
import com.martahrefs.nutrition.model.Food;
import com.martahrefs.nutrition.model.NutritionRepository;
import com.martahrefs.nutrition.model.Product;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


public class NutritionViewModel extends AndroidViewModel {
    // Field for the repository class
    private NutritionRepository mRepository;

    // Field for all the list items
    private LiveData<List<Food>> mAllFood;
    private LiveData<List<Disease>> mAllDiseases;
    private LiveData<List<Product>> mAllProducts;

    public NutritionViewModel(@NonNull Application application) {
        super(application);
        // Instantiate the repository class
        mRepository = new NutritionRepository(application);
        // Assign data/objects to the Lists
        mAllFood = mRepository.getAllFood();
        mAllDiseases = mRepository.getAllDiseases();
        mAllProducts = mRepository.getAllProducts();
    }

    /* Create wrapper methods for the DataBase operation methods in the NutritionRepository
        (In this case, return liveData)*/
    public LiveData<List<Food>> getAllFood(){
        return mAllFood;
    }

    public LiveData<List<Product>> getAllProducts(){
        return mAllProducts;
    }

    public LiveData<List<Disease>> getAllDiseases(){
        return mAllDiseases;
    }


}

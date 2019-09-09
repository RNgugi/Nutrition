package com.martahrefs.nutrition.model;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;

public class NutritionRepository {
    //Create fields for the DAO
    private FoodDao mFoodDao;
    private DiseaseDao mDiseaseDao;
    private ProductDao mProductDao;

    //Fields for ListItems to be held for all Query
    private LiveData<List<Food>> mAllFood;
    private LiveData<List<Disease>> mAllDiseases;
    private LiveData<List<Product>> mAllProducts;

    // A constructor for the class to assign the fields
    public NutritionRepository(Application application){
        // Get an instance of the Database
        NutritionDatabase database = NutritionDatabase.getInstance(application);

        // Get the list of objects
        mFoodDao = database.mFoodDao();
        mAllFood = mFoodDao.getAllFoods();

        mDiseaseDao = database.mDiseaseDao();
        mAllDiseases = mDiseaseDao.getAllDiseases();

        mProductDao = database.mProductDao();
        mAllProducts= mProductDao.getAllProducts();
    }

    // Create methods for the Database Operations
    public void insertFood(Food food){
        new InsertFoodAsync(mFoodDao).execute(food);
    }

    public void insertProduct (Product product){
        new InsertProuctAsync(mProductDao).execute(product);
    }

    public void insertDisease(Disease disease){
        new InsertDiseaseAsync(mDiseaseDao).execute(disease);
    }

    public LiveData<List<Food>> getAllFood(){
        return mAllFood;
    }

    public LiveData<List<Disease>> getAllDiseases(){
        return mAllDiseases;
    }

    public LiveData<List<Product>> getAllProducts(){
        return mAllProducts;
    }

    // Anyschronous tasks to handle inserting of objects into database
    private static class InsertFoodAsync extends AsyncTask<Food,Void,Void>{
        private FoodDao foodDao;

        private InsertFoodAsync(FoodDao foodDao){
            this.foodDao = foodDao;
        }

        @Override
        protected Void doInBackground(Food... foods) {
            //Insert food into database using a background thread
            foodDao.insertFood(foods[0]);
            return null;
        }
    }

    private static class InsertDiseaseAsync extends AsyncTask<Disease,Void,Void>{
        private DiseaseDao diseaseDao;

        private InsertDiseaseAsync(DiseaseDao diseaseDao){
            this.diseaseDao = diseaseDao;
        }
        @Override
        protected Void doInBackground(Disease... diseases) {
            diseaseDao.insertDisease(diseases[0]);
            return null;
        }
    }

    private static class InsertProuctAsync extends AsyncTask<Product,Void,Void>{
        private ProductDao productDao;

        private InsertProuctAsync(ProductDao productDao){
            this.productDao=productDao;
        }
        @Override
        protected Void doInBackground(Product... products) {
            productDao.insertProduct(products[0]);
            return null;
        }
    }





}

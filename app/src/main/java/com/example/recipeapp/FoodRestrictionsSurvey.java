package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodRestrictionsSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodrestrictionssurvey);

    }

    public void RecipeOptions(View view) {
        Intent intent = new Intent(this, recipeinfo.class);
        startActivity(intent);
    }
}
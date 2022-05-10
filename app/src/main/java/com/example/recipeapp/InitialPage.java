package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.example.recipeapp.data.JSONRecipeParser;

import java.io.File;

public class InitialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initialpage);
        JSONRecipeParser parser = new JSONRecipeParser();

        Resources resources = this.getResources();
        parser.getRecipes(resources.openRawResource(R.raw.sample_recipe_data));
    }

    public void sendSurvey (View view){
        Intent intent = new Intent(this,SurveyActivity.class);
        startActivity(intent);
    }
}
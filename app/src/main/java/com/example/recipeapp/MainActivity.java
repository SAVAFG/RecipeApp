package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //populateFirestore();
        //Log.d("data", "firestore updated");
    }

    public void sendSurvey (View view){
        Intent intent = new Intent(getApplicationContext(), UserActivity.class);
        //intent.putExtra("id", "null");
        startActivity(intent);
    }

    // move the base data file into Firebase Firestore.
    private void populateFirestore(){
        final Controller c = (Controller) getApplicationContext();
        Recipe[] recipes;
        Resources resources = this.getResources();
        JSONRecipeParser parser = new JSONRecipeParser();
        recipes = parser.getRecipes(resources.openRawResource(R.raw.small_core_data));

        for(Recipe recipe : recipes){
            c.addRecipe(recipe);
            if(recipe.getRecipeId() >= 100){
                break;
            }
        }
    }
}
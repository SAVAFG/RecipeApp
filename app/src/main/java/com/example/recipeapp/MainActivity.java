package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        //populateFirestore();
    }

    // move the base data file into Firebase Firestore.
    private void populateFirestore(){
        final Controller c = (Controller) getApplicationContext();
        ArrayList<Recipe> recipes;
        Resources resources = this.getResources();
        JSONRecipeParser parser = new JSONRecipeParser();
        recipes = parser.getRecipes(resources.openRawResource(R.raw.core_data));

        for(Recipe recipe : recipes){
            c.addRecipe(recipe);
            break;
        }
    }
}
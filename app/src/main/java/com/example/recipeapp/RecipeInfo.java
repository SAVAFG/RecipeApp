package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;

import java.net.URL;
import java.util.ArrayList;

public class RecipeInfo extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedrecipes);

        JSONRecipeParser parser = new JSONRecipeParser();

        Resources resources = this.getResources();
        parser.getRecipes(resources.openRawResource(R.raw.core_data));

        final JSONRecipeParser aController = (JSONRecipeParser) getApplicationContext();
        Recipe [] recipes = aController.getRecipeList();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();

        for(int i = 0; i < recipes.length; i++) {
            String name = recipes[i].getRecipeName();
            names.add(name);
            String links = recipes[i].getImageUrl();
            urls.add(links);
        }

        recyclerView = findViewById(R.id.fancylayout);

        RecycleAdaptor myadaptor = new RecycleAdaptor(this, names, urls);

        recyclerView.setAdapter(myadaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
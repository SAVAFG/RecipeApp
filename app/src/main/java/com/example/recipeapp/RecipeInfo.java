package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;

import java.util.ArrayList;

public class RecipeInfo extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONRecipeParser parser = new JSONRecipeParser();
        Resources resources = this.getResources();
        Recipe[] recipeList = parser.getRecipes(resources.openRawResource(R.raw.test_core_data));
        final RecipeController aRecipeController = (RecipeController) getApplicationContext();
        aRecipeController.addRecipes(recipeList);
    }

    @Override
     protected void onStart() {
        super.onStart();
        setContentView(R.layout.savedrecipes);

        final RecipeController aRecipeController = (RecipeController) getApplicationContext();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();

        ArrayList<Recipe> recipes = aRecipeController.getRecipes(); // TODO: get based on query

        for(int i = 0; i < recipes.size(); i++) {
            String name = recipes.get(i).getRecipeName();
            names.add(name);
            String links = recipes.get(i).getImageUrl();
            urls.add(links);
        }


        recyclerView = findViewById(R.id.fancylayout);
        RecycleAdaptor myadaptor = new RecycleAdaptor(this, names, urls);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadaptor);

    }
}
package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;

import java.util.ArrayList;

public class RecycleRecipeView extends AppCompatActivity {

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

        final RecipeController controller = (RecipeController) getApplicationContext();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();

        ArrayList<Recipe> recipes = controller.getRecipes(); // TODO: get based on query

        for(int i = 0; i < recipes.size(); i++) {
            String name = recipes.get(i).getRecipeName();
            names.add(name);
            String links = recipes.get(i).getImageUrl();
            urls.add(links);
        }


        recyclerView = findViewById(R.id.recycler);
        RecycleAdaptor adaptor = new RecycleAdaptor(this, names, urls);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(controller, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent = new Intent(RecycleRecipeView.this, SingleRecipeView.class);
                        intent.putExtra("recipe", recipes.get(position));
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        assert true;
                    }
                })
        );

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptor);

    }
}
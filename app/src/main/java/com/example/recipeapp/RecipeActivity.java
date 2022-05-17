package com.example.recipeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONRecipeParser parser = new JSONRecipeParser();
        Resources resources = this.getResources();
        Recipe[] recipeList = parser.getRecipes(resources.openRawResource(R.raw.test_core_data));
        final Controller controller = (Controller) getApplicationContext();
        controller.addRecipes(recipeList);
    }

    @Override
     protected void onStart() {
        super.onStart();
        setContentView(R.layout.savedrecipes);

        final Controller controller = (Controller) getApplicationContext();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();

        ArrayList<Recipe> recipes = controller.getRecipes(); // TODO: get based on query

        for(int i = 0; i < recipes.size(); i++) {
            String name = recipes.get(i).getRecipeName();
            names.add(name);
            String links = recipes.get(i).getImageUrl();
            urls.add(links);
        }


        recyclerView = findViewById(R.id.recipeRecycler);
        RecipeAdapter adaptor = new RecipeAdapter(this, names, urls);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(controller, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent = new Intent(RecipeActivity.this, SingleRecipeView.class);
                        intent.putExtra("recipe", recipes.get(position));
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        assert true;
                    }
                })
        );

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adaptor);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.recipe_list);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.profile_page:
                        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                        intent.putExtra("id", "null");
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.recipe_list:
                        startActivity(new Intent(getApplicationContext(),RecycleRecipeView.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
}
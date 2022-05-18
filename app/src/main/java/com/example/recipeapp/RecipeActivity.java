package com.example.recipeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.example.recipeapp.data.Recipe;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    //CollectionReference recipeRef;
    //FirebaseFirestore db;
    ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // JSONRecipeParser parser = new JSONRecipeParser();
        // Resources resources = this.getResources();
        //recipes = new ArrayList<>();
        //Recipe[] recipeList = parser.getRecipes(resources.openRawResource(R.raw.test_core_data));
        // db = FirebaseFirestore.getInstance();
        // recipeRef = db.collection("recipes");
        // controller.addRecipes(recipeList);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.savedrecipes);
        final Controller controller = (Controller) getApplicationContext();
        recipes = controller.queryRecipes(30);
        //final Controller controller = (Controller) getApplicationContext();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> urls = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler);
        RecipeAdapter adaptor = new RecipeAdapter(RecipeActivity.this, names, urls);

        for(int i = 0; i < recipes.size(); i++) {
            String name = recipes.get(i).getRecipeName();
            names.add(name);
            String links = recipes.get(i).getImageUrl();
            urls.add(links);
        }

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(RecipeActivity.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(RecipeActivity.this, SingleRecipeView.class);
                        intent.putExtra("recipe", recipes.get(position));
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        assert true;
                    }
                })
        );

        recyclerView.setLayoutManager(new GridLayoutManager(RecipeActivity.this, 2));
        recyclerView.setAdapter(adaptor);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.recipe_list);


        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.profile_page:
                        Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                        intent.putExtra("id", "null");
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.recipe_list:
                        startActivity(new Intent(getApplicationContext(), RecipeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recipeapp.data.Recipe;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.Collection;

public class FirebaseRecipeActivity extends AppCompatActivity {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference ref = db.collection("test_recipes");

    private FirestoreAdapter adapter;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedrecipes);
        initRecycler(new ArrayList<String>(){{
            add("eggs");
        }});
    }

    private void initRecycler(ArrayList<String> exclude){
        Query query = ref.orderBy("recipeId");
        FirestoreRecyclerOptions<Recipe> options = new FirestoreRecyclerOptions.Builder<Recipe>()
                .setQuery(query, Recipe.class)
                .build();

        adapter = new FirestoreAdapter(options);
        RecyclerView recyclerView = findViewById(R.id.recycler);


        recyclerView.setLayoutManager(new GridLayoutManager(FirebaseRecipeActivity.this, 2));
        recyclerView.setAdapter(adapter);
    }
}
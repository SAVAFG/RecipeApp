package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

public class RecipeInfo extends AppCompatActivity {

    RecyclerView recyclerView;


    String[] s1;
    int[] images = {R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5,
            R.drawable.food6, R.drawable.food7};
    EditText txt_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedrecipes);

        recyclerView = findViewById(R.id.fancylayout);

        s1 = getResources().getStringArray(R.array.recipenamesexample);


        RecycleAdaptor myadaptor = new RecycleAdaptor(this, s1, images);

        recyclerView.setAdapter(myadaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
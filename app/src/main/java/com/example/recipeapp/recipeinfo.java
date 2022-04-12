package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;

public class recipeinfo extends AppCompatActivity {

    RecyclerView recyclerView;


    String[] s1, s2;
    int[] images = {R.drawable.food2, R.drawable.food3,R.drawable.food4,R.drawable.food5,
            R.drawable.food6,R.drawable.food7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedrecipes);

        recyclerView = findViewById(R.id.fancylayout);

        s1 = getResources().getStringArray(R.array.recipenamesexample);


        recycleadaptor myadaptor = new recycleadaptor(this, s1, images);

        recyclerView.setAdapter(myadaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
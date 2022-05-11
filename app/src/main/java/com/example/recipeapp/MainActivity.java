package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference ref = storage.getReference();
        StorageReference csv = ref.child("utils/core-data_recipe.csv");
        csv.putFile(Uri.parse("utils/core-data_recipe.csv"));
    }
}
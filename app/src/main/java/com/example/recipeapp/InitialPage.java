package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.example.recipeapp.data.JSONRecipeParser;

import java.io.File;

public class InitialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void sendSurvey (View view){
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        intent.putExtra("id", "null");
        startActivity(intent);
    }
}
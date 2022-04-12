package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

public class SurveyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_page);
    }

    public void checkOutput(View v) {
        CharSequence charSequence = "This button works!";
        Toast toasty = Toast.makeText(getApplicationContext(), charSequence, Toast.LENGTH_LONG);
        toasty.show();
    }
}
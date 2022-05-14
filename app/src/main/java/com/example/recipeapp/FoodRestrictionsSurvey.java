package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FoodRestrictionsSurvey extends AppCompatActivity {

    private ImageButton submit;

    private Set<String> allergies;

    private ArrayList<RadioButton> allergyButtons = new ArrayList<RadioButton>();

    private static final String MyPREFERENCES = "Preferences";
    SharedPreferences sharedpreferences;

    private String allergy_key = "allergy_key";
    private String identification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodrestrictionssurvey);

        identification = getIntent().getExtras().getString("id");

        submit = findViewById(R.id.imageButton5);


        allergy_key = identification + allergy_key;

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        allergies = new HashSet<String>();

        allergyButtons.add(findViewById(R.id.radioButton));
        allergyButtons.add(findViewById(R.id.radioButton2));
        allergyButtons.add(findViewById(R.id.radioButton3));
        allergyButtons.add(findViewById(R.id.radioButton4));
        allergyButtons.add(findViewById(R.id.radioButton5));
        allergyButtons.add(findViewById(R.id.radioButton6));
        allergyButtons.add(findViewById(R.id.radioButton7));



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedpreferences.edit();

                for (RadioButton allergyButton : allergyButtons) {
                    if (allergyButton.isChecked()) {
                        allergies.add(allergyButton.getText().toString());
                    }
                }

                editor.putStringSet(allergy_key, allergies);

                editor.apply();

                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("id", identification);
                finish();
                startActivity(intent);

            }
        });
    }
}
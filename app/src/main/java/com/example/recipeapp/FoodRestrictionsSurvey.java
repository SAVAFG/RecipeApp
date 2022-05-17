package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.example.recipeapp.data.Recipe;
import com.example.recipeapp.utils.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FoodRestrictionsSurvey extends AppCompatActivity {
    final ArrayList<CheckBox> allergyButtons = new ArrayList<>();
    //final String MyPREFERENCES = "Preferences";

    private ArrayList<String> allergies;
    //SharedPreferences sharedpreferences;

    //private String allergy_key = "allergy_key";
    //private String identification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodrestrictionssurvey);
        final Controller controller = (Controller) getApplicationContext();
        String name;
        if(getIntent().hasExtra("name")){
            name = getIntent().getExtras().getString("name");
        } else {
            name = "User";
        }

        //identification = getIntent().getExtras().getString("id");
        //allergy_key = identification + allergy_key;

        ImageButton submit = findViewById(R.id.imageButton5);
        //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        allergies = new ArrayList<>();
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
                //SharedPreferences.Editor editor = sharedpreferences.edit();


                for (CheckBox allergyButton : allergyButtons) {
                    if (allergyButton.isChecked()) {
                        allergies.add(allergyButton.getText().toString());
                    }
                }

                User user = new User(name, allergies);
                controller.addUser(user);

                //editor.apply();

                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                //intent.putExtra("id", identification);
                //finish();
                startActivity(intent);

            }
        });
    }
}
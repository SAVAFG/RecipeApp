package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.SharedPreferences;

public class SurveyActivity extends AppCompatActivity {

    //Right now, these variables are declared as static. Since we will use multiple users, in the future
    //we can store the local user information on firebase.

    private String name;
    private EditText text_name;
    private ImageButton submit;

    SharedPreferences sharedpreferences;

    private String identification;

    public static final String MyPREFERENCES = "Preferences";

    public static String name_key = "nameKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        identification = getIntent().getExtras().getString("id");

        name_key = identification + name_key;

        text_name = findViewById(R.id.editTextTextPersonName);

        submit = findViewById(R.id.imageButton4);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedpreferences.edit();

                name = String.valueOf(text_name.getText());

                editor.putString(name_key, name);
                editor.apply();

                //Log.d(Day, Integer.toString(day));

                Log.d(name_key, sharedpreferences.getString(name_key, "null"));

                //Toast.makeText(SurveyActivity.this,"Thanks",Toast.LENGTH_LONG).show();
                //Toast.makeText(SurveyActivity.this,name,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), FoodRestrictionsSurvey.class);
                intent.putExtra("id", identification);
                finish();
                startActivity(intent);
            }
        });
    }



}


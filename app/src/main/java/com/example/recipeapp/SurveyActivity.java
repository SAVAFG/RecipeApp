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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.SharedPreferences;

public class SurveyActivity extends AppCompatActivity {

    //Right now, these variables are declared as static. Since we will use multiple users, in the future
    //we can store the local user information on firebase.
    private int day;
    private int month;
    private int year;
    private String gender;
    private String name;
    private DatePicker date_picker;
    private RadioGroup genderGroup;
    private EditText text_weight, text_name;
    private int weight;
    private RadioButton selectedGender;
    private Button submit;

    SharedPreferences sharedpreferences;

    Resources res;
    String[] keys;

    public static final String user1 = "user1";
    public static final String user2 = "user2";
    public static final String user3 = "user3";


    public static int counter;
    public static final String DAY = "dayKey";
    public static final String MONTH = "monthKey";
    public static final String YEAR = "yearKey";
    public static final String GENDER = "genderKey";
    public static final String NAME = "nameKey";
    public static final String WEIGHT = "weightKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        res = getResources();
        keys = res.getStringArray(R.array.users);

        date_picker = findViewById(R.id.datePickerBirthday);

        genderGroup = findViewById(R.id.radioGroupGender);

        text_weight = findViewById(R.id.numDecimalWeight);
        text_name = findViewById(R.id.editTextTextPersonName);

        submit = findViewById(R.id.nextButton);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedpreferences.edit();

                day  = date_picker.getDayOfMonth();
                month  = date_picker.getMonth();
                year  = date_picker.getYear();
                weight = (int) Double.parseDouble(String.valueOf(text_weight.getText()));
                name = String.valueOf(text_name.getText());

                MyPREFERENCES = name;

                int selectedId = genderGroup.getCheckedRadioButtonId();
                selectedGender = findViewById(selectedId);

                gender = selectedGender.getText().toString();






                editor.putInt(DAY, day);
                editor.putInt(MONTH, month);
                editor.putInt(YEAR, year);
                editor.putString(GENDER, gender);
                editor.putString(NAME, name);
                editor.putInt(WEIGHT, weight);


                editor.commit();

                //Log.d(Day, Integer.toString(day));
                Log.d(DAY, Integer.toString(sharedpreferences.getInt(DAY, -1)));
                Log.d(MONTH, Integer.toString(month));
                Log.d(YEAR, Integer.toString(year));
                Log.d(WEIGHT, Integer.toString(weight));
                Log.d(NAME, name);
                Log.d(GENDER, gender);

                //Toast.makeText(SurveyActivity.this,"Thanks",Toast.LENGTH_LONG).show();
                //Toast.makeText(SurveyActivity.this,name,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), FoodRestrictionsSurvey.class);
                startActivity(intent);
            }
        });
    }

    public void FoodRestrictions (View view){
        Intent intent = new Intent(this, FoodRestrictionsSurvey.class);


    }
}


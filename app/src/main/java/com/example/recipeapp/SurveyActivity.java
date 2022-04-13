package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

public class SurveyActivity extends AppCompatActivity {

    //Right now, these variables are declared as static. Since we will use multiple users, in the future
    //we can store the local user information on firebase.
    public static int day;
    public static int month;
    public static int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

    }

    public void updateBirthday(View v) {
        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.datePickerBirthday); // initiate a date picker
        day = simpleDatePicker.getDayOfMonth();
        month = simpleDatePicker.getMonth();
        year = simpleDatePicker.getYear();
    }

    public void readBirthday(View v) {
        CharSequence values = Integer.toString(day) + " " + Integer.toString(month) + " " + Integer.toString(year);
        Toast toasty = Toast.makeText(getApplicationContext(), values, Toast.LENGTH_LONG);
        toasty.show();
    }

}
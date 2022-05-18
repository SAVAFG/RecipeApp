package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

import com.example.recipeapp.utils.User;

import java.util.ArrayList;

public class DetailProfileActivity extends AppCompatActivity {

    //Right now, these variables are declared as static. Since we will use multiple users, in the future
    //we can store the local user information on firebase.

    private String name;
    private ArrayList<String> restrictions;
    private TextView text_name;
    RecyclerView recyclerView;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_detail);

        final Controller CONTROLLER = (Controller) getApplicationContext();

        int position = getIntent().getExtras().getInt("Position");
        text_name = findViewById(R.id.nameView);
        user = CONTROLLER.getUsers().get(position);
        text_name.setText(user.getName());
        restrictions = user.getRestrictions();

        ImageButton submit = findViewById(R.id.backProfile);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = String.valueOf(text_name.getText());

                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                finish();
                startActivity(intent);
            }
        });

        RestrictionAdapter profAdapter = new RestrictionAdapter(this, restrictions);

        recyclerView = findViewById(R.id.restrictionList);
        recyclerView.setAdapter(profAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}


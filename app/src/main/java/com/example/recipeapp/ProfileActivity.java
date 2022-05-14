package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.SharedPreferences;

import com.example.recipeapp.utils.User;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;


public class ProfileActivity extends AppCompatActivity {

    private static ArrayList<User> users = new ArrayList<User>();
    private static User user1;
    private static User user2;
    private static User user3;

    private static String[] userNames = new String[3];
    Resources res;
    RecyclerView recyclerView;

    SharedPreferences sharedpreferences;

    public static final String MyPREFERENCES = "Preferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        res = getResources();

        userNames = res.getStringArray(R.array.exampleUsers);

        user1 = new User(userNames[0]);
        user2 = new User(userNames[1]);
        user3 = new User(userNames[2]);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        setContentView(R.layout.activity_profiles);

        recyclerView = findViewById(R.id.userLayoutRecycler);

        ProfileAdapter profAdapter = new ProfileAdapter(this, users);

        recyclerView.setAdapter(profAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}

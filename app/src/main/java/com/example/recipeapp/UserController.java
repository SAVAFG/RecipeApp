package com.example.recipeapp;

import android.app.Application;

import com.example.recipeapp.utils.User;


import java.util.ArrayList;

public class UserController extends Application {
    private ArrayList<User> users;

    @Override
    public void onCreate() {
        super.onCreate();
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
}

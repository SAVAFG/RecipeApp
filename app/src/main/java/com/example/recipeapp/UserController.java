package com.example.recipeapp;

import android.app.Application;

import com.example.recipeapp.utils.ArraySerializer;
import com.example.recipeapp.utils.User;


import java.sql.Array;
import java.util.ArrayList;

public class UserController extends Application {
    private ArrayList<User> users;
    ArraySerializer serializer;

    @Override
    public void onCreate() {
        super.onCreate();
        serializer = new ArraySerializer(this);
        users = (ArrayList<User>) serializer.getListUsers("users");
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
        serializer.putListUser("users", this.users);
    }

    public void addUsers(ArrayList<User> users){
        this.users.addAll(users);
        serializer.putListUser("users", this.users);
    }

    public void removeUser(User user){
        users.remove(user);
        serializer.putListUser("users", users);
    }
}

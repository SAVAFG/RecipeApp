package com.example.recipeapp;

import android.app.Application;
import android.content.res.Resources;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;
import com.example.recipeapp.utils.ArraySerializer;
import com.example.recipeapp.utils.User;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller extends Application {
    private ArrayList<Recipe> recipes;
    private ArrayList<User> users;
    ArraySerializer serializer;
    FirebaseFirestore db;

    @Override
    public void onCreate() {
        super.onCreate();
        recipes = new ArrayList<>();
        db = FirebaseFirestore.getInstance();

        serializer = new ArraySerializer(this);
        users = (ArrayList<User>) serializer.getListUsers("users");
    }

    public ArrayList<Recipe> getRecipes(){
        return recipes;
    }

    public void addRecipes(Recipe[] recipes){
        this.recipes.addAll(Arrays.asList(recipes));
    }

    public void addRecipe(Recipe recipe){

        db.collection("recipes")
                .add(recipe)
                .addOnSuccessListener(documentReference -> Log.d("success", "DocumentSnapshot added with ID: " + documentReference.getId()))
                .addOnFailureListener(e -> Log.w("fail", "Error adding document", e));
    }

    public ArrayList<Recipe> queryRecipeExclude(ArrayList<String> exclude){
        return null;
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

package com.example.recipeapp;

import android.app.Application;
import android.content.res.Resources;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;
import com.example.recipeapp.utils.ArraySerializer;
import com.example.recipeapp.utils.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Controller extends Application {
    private Recipe[] recipes;
    private ArrayList<User> users;
    ArraySerializer serializer;
    FirebaseFirestore db;
    CollectionReference recipeRef;

    @Override
    public void onCreate() {
        super.onCreate();
        JSONRecipeParser parser = new JSONRecipeParser();
        Resources resources = this.getResources();

        recipes = parser.getRecipes(resources.openRawResource(R.raw.small_core_data));


        // db = FirebaseFirestore.getInstance();
        // recipeRef = db.collection("recipes");

        serializer = new ArraySerializer(this);

        users = serializer.getListUsers("users");
    }

    public Recipe[] getTestRecipes(){
        return recipes;
    }


    public void addRecipe(Recipe recipe){

        db.collection("test_recipes")
                .add(recipe)
                .addOnSuccessListener(documentReference -> Log.d("success", "DocumentSnapshot added with ID: " + documentReference.getId()))
                .addOnFailureListener(e -> Log.w("fail", "Error adding document", e));
    }

    public ArrayList<Recipe> queryRecipes(int n){
        ArrayList<Recipe> out = new ArrayList<>();
        for(Recipe r : recipes){
            for(String exclude : getCollectivePreferences()){
                if (!r.getRestrictions().contains(exclude)) {
                    out.add(r);
                    break;
                }
            }
            if(out.size() >= n){
                return out;
            }
        }
        return out;
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

    public ArrayList<Recipe> sampleNRecipes(int n){
        return null;
    }

    public ArrayList<String> getCollectivePreferences(){
        ArrayList<String> out = new ArrayList<>();
        for(User u: users){
            out.addAll(u.getRestrictions());
        }
        return out;
    }
}

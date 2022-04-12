package com.example.recipeapp.utils;

import java.util.ArrayList;

public class Recipe {
    String name;
    ArrayList<String> ingredients;
    ArrayList<String> directions;

    public Recipe(String name, ArrayList<String> ingredients, ArrayList<String> directions){
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<String> directions) {
        this.directions = directions;
    }
}

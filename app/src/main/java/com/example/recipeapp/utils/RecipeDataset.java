package com.example.recipeapp.utils;

import java.util.ArrayList;

public class RecipeDataset {
    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public RecipeDataset(){
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    ArrayList<Recipe> recipes;

}

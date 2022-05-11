package com.example.recipeapp.data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class JSONRecipeParser {
    ObjectMapper mapper;

    public JSONRecipeParser() {
        mapper = new ObjectMapper();
    }

    public Recipe[] getRecipes(InputStream file) {
        try {
            // JSON file to Java object
            Recipe[] recipeList = mapper.readValue(file, Recipe[].class);

            for (Recipe recipe : recipeList) {
                System.out.println("RECIPE ID: " + recipe.getRecipeId());
                System.out.println("RECIPE NAME: " + recipe.getRecipeName());
                System.out.println("IMAGE URL: " + recipe.getImageUrl());
                System.out.println("INGREDIENTS: " + recipe.getIngredients());
                System.out.println("COOKING DIRECTIONS: " + recipe.getCookingDirections());

                // Get the Nutrition object data
                Nutritions nutritions = recipe.getNutritions();
                Niacin niacin = nutritions.getNiacin();

                // Get the Niacin object data
                System.out.println(niacin);

                // KEEP GOING BASED ON THE DATA MODEL
            }
            return recipeList;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

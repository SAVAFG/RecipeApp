package com.example.recipeapp.data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONRecipeParser {
    ObjectMapper mapper;

    public JSONRecipeParser() {
        mapper = new ObjectMapper();
    }

    public ArrayList<Recipe> getRecipes(InputStream file) {
        try {
            // JSON file to Java object
            Recipe[] recipeList = mapper.readValue(file, Recipe[].class);
            return new ArrayList<>(Arrays.asList(recipeList));

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
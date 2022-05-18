package com.example.recipeapp.data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;


public class JSONRecipeParser {
    ObjectMapper mapper;

    public JSONRecipeParser() {
        mapper = new ObjectMapper();
    }

    public Recipe[] getRecipes(InputStream file) {
        try {
            // JSON file to Java object
            return mapper.readValue(file, Recipe[].class);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
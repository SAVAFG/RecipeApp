package com.example.recipeapp.JSONRecipeParser.src;

import com.example.recipeapp.JSONRecipeParser.src.Recipe;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class JSONRecipeParser {
	ObjectMapper mapper;

	public JSONRecipeParser() {
		mapper = new ObjectMapper();
	}

	public ArrayList<Recipe> getRecipes(InputStream file) {
		try {

			// JSON file to Java object
			RecipeData recipeData = mapper.readValue(file, RecipeData.class);
			System.out.println(recipeData);

			// Get list of "Recipe" objects, you know this is a list because of the [ ... ]
			ArrayList<Recipe> recipeList = (ArrayList<Recipe>) recipeData.getRecipe();
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
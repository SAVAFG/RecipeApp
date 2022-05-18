package com.example.recipeapp.data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recipe_id",
        "recipe_name",
        "image_url",
        "ingredients",
        "cooking_directions",
        "Prep",
        "Cook",
        "Ready In",
        "restrictions"
})
@Generated("jsonschema2pojo")
public class Recipe implements Serializable
{

    @JsonProperty("recipe_id")
    private Integer recipeId;
    @JsonProperty("recipe_name")
    private String recipeName;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("ingredients")
    private List<String> ingredients = null;
    @JsonProperty("cooking_directions")
    private String cookingDirections;
    @JsonProperty("Prep")
    private String prep;
    @JsonProperty("Cook")
    private String cook;
    @JsonProperty("Ready In")
    private String readyIn;
    @JsonProperty("restrictions")
    private List<String> restrictions = null;
    private final static long serialVersionUID = 3064416104256069176L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Recipe() {
    }

    /**
     *
     * @param recipeName
     * @param cookingDirections
     * @param cook
     * @param imageUrl
     * @param ingredients
     * @param prep
     * @param restrictions
     * @param recipeId
     * @param readyIn
     */

    public Recipe(Integer recipeId, String recipeName, String imageUrl, List<String> ingredients, String cookingDirections, String prep, String cook, String readyIn, List<String> restrictions) {
        super();
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.cookingDirections = cookingDirections;
        this.prep = prep;
        this.cook = cook;
        this.readyIn = readyIn;
        this.restrictions = restrictions;
    }

    @JsonProperty("recipe_id")
    public Integer getRecipeId() {
        return recipeId;
    }

    @JsonProperty("recipe_id")
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @JsonProperty("recipe_name")
    public String getRecipeName() {
        return recipeName;
    }

    @JsonProperty("recipe_name")
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("ingredients")
    public List<String> getIngredients() {
        return ingredients;
    }

    public String getIngredientsAsString(){
        return ingredients.stream().collect(Collectors.joining(", "));
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("cooking_directions")
    public String getCookingDirections() {
        return cookingDirections;
    }

    @JsonProperty("cooking_directions")
    public void setCookingDirections(String cookingDirections) {
        this.cookingDirections = cookingDirections;
    }

    @JsonProperty("Prep")
    public String getPrep() {
        return prep;
    }

    @JsonProperty("Prep")
    public void setPrep(String prep) {
        this.prep = prep;
    }

    @JsonProperty("Cook")
    public String getCook() {
        return cook;
    }

    @JsonProperty("Cook")
    public void setCook(String cook) {
        this.cook = cook;
    }

    @JsonProperty("Ready In")
    public String getReadyIn() {
        return readyIn;
    }

    @JsonProperty("Ready In")
    public void setReadyIn(String readyIn) {
        this.readyIn = readyIn;
    }

    @JsonProperty("restrictions")
    public List<String> getRestrictions() {
        return restrictions;
    }

    @JsonProperty("restrictions")
    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Recipe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipeId");
        sb.append('=');
        sb.append(((this.recipeId == null)?"<null>":this.recipeId));
        sb.append(',');
        sb.append("recipeName");
        sb.append('=');
        sb.append(((this.recipeName == null)?"<null>":this.recipeName));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("ingredients");
        sb.append('=');
        sb.append(((this.ingredients == null)?"<null>":this.ingredients));
        sb.append(',');
        sb.append("cookingDirections");
        sb.append('=');
        sb.append(((this.cookingDirections == null)?"<null>":this.cookingDirections));
        sb.append(',');
        sb.append("prep");
        sb.append('=');
        sb.append(((this.prep == null)?"<null>":this.prep));
        sb.append(',');
        sb.append("cook");
        sb.append('=');
        sb.append(((this.cook == null)?"<null>":this.cook));
        sb.append(',');
        sb.append("readyIn");
        sb.append('=');
        sb.append(((this.readyIn == null)?"<null>":this.readyIn));
        sb.append(',');
        sb.append("restrictions");
        sb.append('=');
        sb.append(((this.restrictions == null)?"<null>":this.restrictions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
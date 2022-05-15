
package com.example.recipeapp.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    "nutritions"
})
@Generated("jsonschema2pojo")
public class Recipe implements Serializable {

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
    @JsonProperty("nutritions")
    private Nutritions nutritions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * @param imageUrl
     * @param ingredients
     * @param recipeId
     * @param nutritions
     */
    public Recipe(Integer recipeId, String recipeName, String imageUrl, List<String> ingredients, String cookingDirections, Nutritions nutritions) {
        super();
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.cookingDirections = cookingDirections;
        this.nutritions = nutritions;
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

    @JsonProperty("ingredients")
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredientsAsString(){
        return ingredients.stream().collect(Collectors.joining(", "));
    }

    @JsonProperty("cooking_directions")
    public String getCookingDirections() {
        return cookingDirections;
    }

    @JsonProperty("cooking_directions")
    public void setCookingDirections(String cookingDirections) {
        this.cookingDirections = cookingDirections;
    }

    @JsonProperty("nutritions")
    public Nutritions getNutritions() {
        return nutritions;
    }

    @JsonProperty("nutritions")
    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("nutritions");
        sb.append('=');
        sb.append(((this.nutritions == null)?"<null>":this.nutritions));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}

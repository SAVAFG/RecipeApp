
package com.example.recipeapp.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "niacin",
    "sugars",
    "sodium",
    "carbohydrates",
    "vitaminB6",
    "calories",
    "thiamin",
    "fat",
    "folate",
    "caloriesFromFat",
    "calcium",
    "fiber",
    "magnesium",
    "iron",
    "cholesterol",
    "protein",
    "vitaminA",
    "potassium",
    "saturatedFat",
    "vitaminC"
})
@Generated("jsonschema2pojo")
public class Nutritions implements Serializable {

    @JsonProperty("niacin")
    private Niacin niacin;
    @JsonProperty("sugars")
    private Sugars sugars;
    @JsonProperty("sodium")
    private Sodium sodium;
    @JsonProperty("carbohydrates")
    private Carbohydrates carbohydrates;
    @JsonProperty("vitaminB6")
    private VitaminB6 vitaminB6;
    @JsonProperty("calories")
    private Calories calories;
    @JsonProperty("thiamin")
    private Thiamin thiamin;
    @JsonProperty("fat")
    private Fat fat;
    @JsonProperty("folate")
    private Folate folate;
    @JsonProperty("caloriesFromFat")
    private CaloriesFromFat caloriesFromFat;
    @JsonProperty("calcium")
    private Calcium calcium;
    @JsonProperty("fiber")
    private Fiber fiber;
    @JsonProperty("magnesium")
    private Magnesium magnesium;
    @JsonProperty("iron")
    private Iron iron;
    @JsonProperty("cholesterol")
    private Cholesterol cholesterol;
    @JsonProperty("protein")
    private Protein protein;
    @JsonProperty("vitaminA")
    private VitaminA vitaminA;
    @JsonProperty("potassium")
    private Potassium potassium;
    @JsonProperty("saturatedFat")
    private SaturatedFat saturatedFat;
    @JsonProperty("vitaminC")
    private VitaminC vitaminC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nutritions() {
    }

    /**
     * 
     * @param carbohydrates
     * @param fiber
     * @param sugars
     * @param calcium
     * @param potassium
     * @param vitaminC
     * @param thiamin
     * @param niacin
     * @param magnesium
     * @param calories
     * @param sodium
     * @param saturatedFat
     * @param folate
     * @param caloriesFromFat
     * @param vitaminB6
     * @param protein
     * @param fat
     * @param iron
     * @param cholesterol
     * @param vitaminA
     */
    public Nutritions(Niacin niacin, Sugars sugars, Sodium sodium, Carbohydrates carbohydrates, VitaminB6 vitaminB6, Calories calories, Thiamin thiamin, Fat fat, Folate folate, CaloriesFromFat caloriesFromFat, Calcium calcium, Fiber fiber, Magnesium magnesium, Iron iron, Cholesterol cholesterol, Protein protein, VitaminA vitaminA, Potassium potassium, SaturatedFat saturatedFat, VitaminC vitaminC) {
        super();
        this.niacin = niacin;
        this.sugars = sugars;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.vitaminB6 = vitaminB6;
        this.calories = calories;
        this.thiamin = thiamin;
        this.fat = fat;
        this.folate = folate;
        this.caloriesFromFat = caloriesFromFat;
        this.calcium = calcium;
        this.fiber = fiber;
        this.magnesium = magnesium;
        this.iron = iron;
        this.cholesterol = cholesterol;
        this.protein = protein;
        this.vitaminA = vitaminA;
        this.potassium = potassium;
        this.saturatedFat = saturatedFat;
        this.vitaminC = vitaminC;
    }

    @JsonProperty("niacin")
    public Niacin getNiacin() {
        return niacin;
    }

    @JsonProperty("niacin")
    public void setNiacin(Niacin niacin) {
        this.niacin = niacin;
    }

    @JsonProperty("sugars")
    public Sugars getSugars() {
        return sugars;
    }

    @JsonProperty("sugars")
    public void setSugars(Sugars sugars) {
        this.sugars = sugars;
    }

    @JsonProperty("sodium")
    public Sodium getSodium() {
        return sodium;
    }

    @JsonProperty("sodium")
    public void setSodium(Sodium sodium) {
        this.sodium = sodium;
    }

    @JsonProperty("carbohydrates")
    public Carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    @JsonProperty("carbohydrates")
    public void setCarbohydrates(Carbohydrates carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @JsonProperty("vitaminB6")
    public VitaminB6 getVitaminB6() {
        return vitaminB6;
    }

    @JsonProperty("vitaminB6")
    public void setVitaminB6(VitaminB6 vitaminB6) {
        this.vitaminB6 = vitaminB6;
    }

    @JsonProperty("calories")
    public Calories getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(Calories calories) {
        this.calories = calories;
    }

    @JsonProperty("thiamin")
    public Thiamin getThiamin() {
        return thiamin;
    }

    @JsonProperty("thiamin")
    public void setThiamin(Thiamin thiamin) {
        this.thiamin = thiamin;
    }

    @JsonProperty("fat")
    public Fat getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(Fat fat) {
        this.fat = fat;
    }

    @JsonProperty("folate")
    public Folate getFolate() {
        return folate;
    }

    @JsonProperty("folate")
    public void setFolate(Folate folate) {
        this.folate = folate;
    }

    @JsonProperty("caloriesFromFat")
    public CaloriesFromFat getCaloriesFromFat() {
        return caloriesFromFat;
    }

    @JsonProperty("caloriesFromFat")
    public void setCaloriesFromFat(CaloriesFromFat caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    @JsonProperty("calcium")
    public Calcium getCalcium() {
        return calcium;
    }

    @JsonProperty("calcium")
    public void setCalcium(Calcium calcium) {
        this.calcium = calcium;
    }

    @JsonProperty("fiber")
    public Fiber getFiber() {
        return fiber;
    }

    @JsonProperty("fiber")
    public void setFiber(Fiber fiber) {
        this.fiber = fiber;
    }

    @JsonProperty("magnesium")
    public Magnesium getMagnesium() {
        return magnesium;
    }

    @JsonProperty("magnesium")
    public void setMagnesium(Magnesium magnesium) {
        this.magnesium = magnesium;
    }

    @JsonProperty("iron")
    public Iron getIron() {
        return iron;
    }

    @JsonProperty("iron")
    public void setIron(Iron iron) {
        this.iron = iron;
    }

    @JsonProperty("cholesterol")
    public Cholesterol getCholesterol() {
        return cholesterol;
    }

    @JsonProperty("cholesterol")
    public void setCholesterol(Cholesterol cholesterol) {
        this.cholesterol = cholesterol;
    }

    @JsonProperty("protein")
    public Protein getProtein() {
        return protein;
    }

    @JsonProperty("protein")
    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    @JsonProperty("vitaminA")
    public VitaminA getVitaminA() {
        return vitaminA;
    }

    @JsonProperty("vitaminA")
    public void setVitaminA(VitaminA vitaminA) {
        this.vitaminA = vitaminA;
    }

    @JsonProperty("potassium")
    public Potassium getPotassium() {
        return potassium;
    }

    @JsonProperty("potassium")
    public void setPotassium(Potassium potassium) {
        this.potassium = potassium;
    }

    @JsonProperty("saturatedFat")
    public SaturatedFat getSaturatedFat() {
        return saturatedFat;
    }

    @JsonProperty("saturatedFat")
    public void setSaturatedFat(SaturatedFat saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    @JsonProperty("vitaminC")
    public VitaminC getVitaminC() {
        return vitaminC;
    }

    @JsonProperty("vitaminC")
    public void setVitaminC(VitaminC vitaminC) {
        this.vitaminC = vitaminC;
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
        sb.append(Nutritions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("niacin");
        sb.append('=');
        sb.append(((this.niacin == null)?"<null>":this.niacin));
        sb.append(',');
        sb.append("sugars");
        sb.append('=');
        sb.append(((this.sugars == null)?"<null>":this.sugars));
        sb.append(',');
        sb.append("sodium");
        sb.append('=');
        sb.append(((this.sodium == null)?"<null>":this.sodium));
        sb.append(',');
        sb.append("carbohydrates");
        sb.append('=');
        sb.append(((this.carbohydrates == null)?"<null>":this.carbohydrates));
        sb.append(',');
        sb.append("vitaminB6");
        sb.append('=');
        sb.append(((this.vitaminB6 == null)?"<null>":this.vitaminB6));
        sb.append(',');
        sb.append("calories");
        sb.append('=');
        sb.append(((this.calories == null)?"<null>":this.calories));
        sb.append(',');
        sb.append("thiamin");
        sb.append('=');
        sb.append(((this.thiamin == null)?"<null>":this.thiamin));
        sb.append(',');
        sb.append("fat");
        sb.append('=');
        sb.append(((this.fat == null)?"<null>":this.fat));
        sb.append(',');
        sb.append("folate");
        sb.append('=');
        sb.append(((this.folate == null)?"<null>":this.folate));
        sb.append(',');
        sb.append("caloriesFromFat");
        sb.append('=');
        sb.append(((this.caloriesFromFat == null)?"<null>":this.caloriesFromFat));
        sb.append(',');
        sb.append("calcium");
        sb.append('=');
        sb.append(((this.calcium == null)?"<null>":this.calcium));
        sb.append(',');
        sb.append("fiber");
        sb.append('=');
        sb.append(((this.fiber == null)?"<null>":this.fiber));
        sb.append(',');
        sb.append("magnesium");
        sb.append('=');
        sb.append(((this.magnesium == null)?"<null>":this.magnesium));
        sb.append(',');
        sb.append("iron");
        sb.append('=');
        sb.append(((this.iron == null)?"<null>":this.iron));
        sb.append(',');
        sb.append("cholesterol");
        sb.append('=');
        sb.append(((this.cholesterol == null)?"<null>":this.cholesterol));
        sb.append(',');
        sb.append("protein");
        sb.append('=');
        sb.append(((this.protein == null)?"<null>":this.protein));
        sb.append(',');
        sb.append("vitaminA");
        sb.append('=');
        sb.append(((this.vitaminA == null)?"<null>":this.vitaminA));
        sb.append(',');
        sb.append("potassium");
        sb.append('=');
        sb.append(((this.potassium == null)?"<null>":this.potassium));
        sb.append(',');
        sb.append("saturatedFat");
        sb.append('=');
        sb.append(((this.saturatedFat == null)?"<null>":this.saturatedFat));
        sb.append(',');
        sb.append("vitaminC");
        sb.append('=');
        sb.append(((this.vitaminC == null)?"<null>":this.vitaminC));
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

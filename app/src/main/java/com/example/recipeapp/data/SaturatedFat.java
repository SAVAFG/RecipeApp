
package com.example.recipeapp.data;

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
    "hasCompleteData",
    "name",
    "amount",
    "percentDailyValue",
    "displayValue",
    "unit"
})
@Generated("jsonschema2pojo")
public class SaturatedFat {

    @JsonProperty("hasCompleteData")
    private Boolean hasCompleteData;
    @JsonProperty("name")
    private String name;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("percentDailyValue")
    private String percentDailyValue;
    @JsonProperty("displayValue")
    private String displayValue;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SaturatedFat() {
    }

    /**
     * 
     * @param displayValue
     * @param hasCompleteData
     * @param amount
     * @param unit
     * @param name
     * @param percentDailyValue
     */
    public SaturatedFat(Boolean hasCompleteData, String name, Double amount, String percentDailyValue, String displayValue, String unit) {
        super();
        this.hasCompleteData = hasCompleteData;
        this.name = name;
        this.amount = amount;
        this.percentDailyValue = percentDailyValue;
        this.displayValue = displayValue;
        this.unit = unit;
    }

    @JsonProperty("hasCompleteData")
    public Boolean getHasCompleteData() {
        return hasCompleteData;
    }

    @JsonProperty("hasCompleteData")
    public void setHasCompleteData(Boolean hasCompleteData) {
        this.hasCompleteData = hasCompleteData;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("percentDailyValue")
    public String getPercentDailyValue() {
        return percentDailyValue;
    }

    @JsonProperty("percentDailyValue")
    public void setPercentDailyValue(String percentDailyValue) {
        this.percentDailyValue = percentDailyValue;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
        sb.append(SaturatedFat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasCompleteData");
        sb.append('=');
        sb.append(((this.hasCompleteData == null)?"<null>":this.hasCompleteData));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("percentDailyValue");
        sb.append('=');
        sb.append(((this.percentDailyValue == null)?"<null>":this.percentDailyValue));
        sb.append(',');
        sb.append("displayValue");
        sb.append('=');
        sb.append(((this.displayValue == null)?"<null>":this.displayValue));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
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

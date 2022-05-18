package com.example.recipeapp.utils;
import android.os.Build;
import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.*;

public class User implements Serializable {
    private String name;
    private ArrayList<String> restrictions;
    private String id;
    private Calendar birthday;
    private double weight;


    public User(String name, ArrayList<String> restrictions){
        this.name = name;
        this.restrictions = restrictions;
    }

    public User(String name, Calendar birthday, int weight, String id) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.id = id;
    }

    public User(String id) {
        this.name = "";
        this.birthday = Calendar.getInstance();
        this.weight = 0;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        Calendar today = Calendar.getInstance();
        return today.get(YEAR) - birthday.get(YEAR);
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getRestrictions() { return restrictions;}

}
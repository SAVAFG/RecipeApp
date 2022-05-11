package com.example.recipeapp.utils;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.*;

public class User {
    private String name;
    private Calendar birthday;
    private double weight;


    public User(String name, Calendar birthday, int weight){
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        Calendar today = Calendar.getInstance();
        return today.get(YEAR) - birthday.get(YEAR);
    }

    public void setBirthday(Calendar birthday){
        this.birthday = birthday;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}

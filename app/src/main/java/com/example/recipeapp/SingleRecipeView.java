package com.example.recipeapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipeapp.data.Recipe;
import com.squareup.picasso.Picasso;

public class SingleRecipeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_details);

        getIncomingIntent();

        Button add = findViewById(R.id.add_recipe);

        //add.setOnClickListener();

    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("recipe")){
            setView((Recipe) getIntent().getSerializableExtra("recipe"));
        }
    }

    private void setView(Recipe recipe){
        TextView name = findViewById(R.id.details_name);
        ImageView image = findViewById(R.id.details_image);

        name.setText(recipe.getRecipeName());
        Picasso.get().load(recipe.getImageUrl()).into(image);
    }


}

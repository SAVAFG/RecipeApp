package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.recipeapp.utils.RecipeDataset;

import java.util.ArrayList;

public class RecipeInfo extends AppCompatActivity {

    RecyclerView recyclerView;


    String[] s1;
    int[] images = {R.drawable.food2, R.drawable.food3,R.drawable.food4,R.drawable.food5,
            R.drawable.food6,R.drawable.food7};
    EditText txt_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedrecipes);

        recyclerView = findViewById(R.id.fancylayout);

        s1 = getResources().getStringArray(R.array.recipenamesexample);

        txt_Search=(EditText)findViewById(R.id.txt_searchtext);

        RecycleAdaptor myadaptor = new RecycleAdaptor(this, s1, images);

        recyclerView.setAdapter(myadaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        txt_Search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

        private void filter(String text) {
            ArrayList<RecipeDataset> filterList = new ArrayList<>();
                //figure out what array list i want to look through
            //for (RecipeDataset item: s1) {
              //  if (item.getItemName().toLowerCase().contains(text.toLowerCase())) {

                //    filterList.add(item);

                }
       //     }


     //   }
}
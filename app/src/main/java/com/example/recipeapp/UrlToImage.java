package com.example.recipeapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class UrlToImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_row);

        ImageView imageView=findViewById(R.id.imageView);

       // for (int i; i < urls.size(); i++) {
         //  urls(i).Picasso.get().load(url).placeholder(R.drawable.homepagerecipeapp).into(imageView);
     // }
    }
}

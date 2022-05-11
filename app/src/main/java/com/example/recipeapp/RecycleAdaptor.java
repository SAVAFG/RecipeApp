package com.example.recipeapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipeapp.data.JSONRecipeParser;
import com.example.recipeapp.data.Recipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

   public class RecycleAdaptor extends RecyclerView.Adapter<RecycleAdaptor.MyViewHolder> {
       ArrayList<String> saaya;
       ArrayList<String> urls;
       Context context;

       public RecycleAdaptor(Context ct, ArrayList<String> s1, ArrayList<String> img) {
           context = ct;
           saaya = s1;
           urls = img;
       }

       @NonNull
       @Override
       public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           LayoutInflater inflater = LayoutInflater.from(context);
           View view = inflater.inflate(R.layout.my_row, parent, false);
           return new MyViewHolder(view);
       }

       @Override
       public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

           for (int i = 0; i < names.length(); i++) {
               holder.myText1.setText(names.get(i));
               // holder.myImage.setImageResource(images.get(position));
           }
       }

       @Override
       public int getItemCount() {
           return 0;
       }


       public class MyViewHolder extends RecyclerView.ViewHolder {

           TextView myText1;
           ImageView myImage;

           public MyViewHolder(@NonNull View itemView) {
               super(itemView);
               myText1 = itemView.findViewById(R.id.foodie);
               //     myImage = itemView.findViewById(R.id.imageView);
           }
       }

       public class URLtoImage extends AppCompatActivity {
          //  for(int i; i < images.length(); i++) {
         //  images(i).Picasso.get().load(images).placeholder(R.drawable.homepagerecipeapp).into(imageView);
        }

       public class getRecipeNames extends RecipeInfo {

           final JSONRecipeParser aController = (JSONRecipeParser) getApplicationContext();
           Recipe[] recipes = aController.getRecipeList();
           ArrayList<String> names = new ArrayList<>();

            for(int i = 0; i < recipes.length; i++) {
               String name = recipes[i].getRecipeName();
               names.add(name);
            }}

       public class getRecipeURLS extends RecipeInfo {

           final JSONRecipeParser aController = (JSONRecipeParser) getApplicationContext();
           Recipe[] recipes = aController.getRecipeList();
           ArrayList<String> urls = new ArrayList<>();

            for(int i = 0; i < recipes.length; i++) {
               String url = recipes[i].getImageUrl();
               urls.add(url);
           }}
   }

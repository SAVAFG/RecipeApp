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

import java.net.URI;
import java.util.ArrayList;

   public class RecycleAdaptor extends RecyclerView.Adapter<RecycleAdaptor.MyViewHolder> {
       ArrayList<String> names;
       ArrayList<String> urls;
       Context context;

       public RecycleAdaptor(Context ct, ArrayList<String> s1, ArrayList<String> imgUrls) {
           context = ct;
           names = s1;
           urls = imgUrls;
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

           for (int i = 0; i < names.size(); i++) {
               holder.myText1.setText(names.get(i));
               holder.myImage.setImageResource();
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

        public void URLStoImage(ArrayList<String> urls){
           for(String url : urls){
                return;
           }
        }

       public class getRecipeNames extends RecipeInfo {

           final Controller aController = (Controller) getApplicationContext();
           ArrayList<Recipe> recipes = aController.getRecipes();
           ArrayList<String> names = new ArrayList<>();

            for(int i = 0; i < recipes.size(); i++) {
               String name = recipes[i].getRecipeName();
               names.add(name);
            }}

       public class getRecipeURLS extends RecipeInfo {

           final Controller aController = (Controller) getApplicationContext();
           ArrayList<Recipe> recipes = aController.getRecipes();
           ArrayList<String> urls = new ArrayList<>();

           for(int i = 0; i < recipes.size(); i++) {
               String url = recipes[i].getImageUrl();
               urls.add(url);
           }}
   }

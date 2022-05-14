package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

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
           View view = inflater.inflate(R.layout.recycler_recipe_view, parent, false);
           return new MyViewHolder(view);
       }

       @Override
       public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
           holder.cardText.setText(names.get(position));
           Picasso.get().load(urls.get(position)).into(holder.cardImage); // TODO: add code to reformat image to standardized format.

       }

       @Override
       public int getItemCount() {
           return names.size();
       }


       public static class MyViewHolder extends RecyclerView.ViewHolder {

           TextView cardText;
           ImageView cardImage;

           public MyViewHolder(@NonNull View itemView) {
               super(itemView);
               cardText = (TextView) itemView.findViewById(R.id.foodie);
               cardImage = (ImageView) itemView.findViewById(R.id.imageView);
           }
       }

       // pass in an ArrayList of Recipes to get an ArrayList of names and an ArrayList of img urls.
       // recipe ArrayList should have been obtained through a query.

       /*
       public Pair<ArrayList<String>, ArrayList<String>> parseRecipes(ArrayList<Recipe> recipes) {
           ArrayList<String> urls = new ArrayList<>();
           ArrayList<String> names = new ArrayList<>();

           for(Recipe recipe : recipes){
               urls.add(recipe.getRecipeName());
                names.add(recipe.getImageUrl());
           }
           return new Pair<>(names, urls);
       }
       */

   }

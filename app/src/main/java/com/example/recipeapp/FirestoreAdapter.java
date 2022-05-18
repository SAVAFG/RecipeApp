package com.example.recipeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.data.Recipe;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.firebase.ui.firestore.paging.FirestorePagingAdapter;
import com.firebase.ui.firestore.paging.FirestorePagingOptions;
import com.squareup.picasso.Picasso;

public class FirestoreAdapter extends FirestoreRecyclerAdapter<Recipe, FirestoreAdapter.RecipeHolder> {

    public FirestoreAdapter(@NonNull FirestoreRecyclerOptions<Recipe> options) {
        super(options);
    }

    @NonNull
    @Override
    public RecipeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_recipe_view, parent, false);
        return new RecipeHolder(v);
    }

    @Override
    protected void onBindViewHolder(@NonNull RecipeHolder holder, int position, @NonNull Recipe model) {
        holder.cardText.setText(model.getRecipeName());
        Picasso.get().load(model.getImageUrl()).into(holder.cardImage);
    }

    public static class RecipeHolder extends RecyclerView.ViewHolder {

        TextView cardText;
        ImageView cardImage;

        public RecipeHolder(@NonNull View itemView) {
            super(itemView);
            cardText = (TextView) itemView.findViewById(R.id.foodie);
            cardImage = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}

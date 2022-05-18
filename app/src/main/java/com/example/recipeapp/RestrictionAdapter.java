package com.example.recipeapp;

import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.utils.User;

import java.util.ArrayList;

public class RestrictionAdapter extends RecyclerView.Adapter<RestrictionAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> restrictions;
    SharedPreferences sharedpreferences;

    public static final String MyPREFERENCES = "Preferences";

    public RestrictionAdapter(Context ct, ArrayList<String> restrictions) {
        context = ct;
        this.restrictions = restrictions;
        sharedpreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.restriction_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String restriction = restrictions.get(position);
        holder.myText1.setText(restriction);
    }

    @Override
    public int getItemCount() {
        return restrictions.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.restrictionView);
        }
    }


}

package com.example.recipeapp;

import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.utils.User;

import java.util.ArrayList;
import java.util.Calendar;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<User> users;
    RecyclerView current;

    SharedPreferences sharedpreferences;

    public static final String MyPREFERENCES = "Preferences";

    public ProfileAdapter(Context ct, ArrayList<User> users) {
        context = ct;
        this.users = users;

        sharedpreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ArrayList<String> birthdays = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();

        for (User profile : users) {
            birthdays.add(profile.getBirthday().toString());
            names.add(profile.getName());
        }

        holder.myText2.setText(birthdays.get(position));
        holder.myText1.setText(names.get(position));
    }




    @Override
    public int getItemCount() {
        return users.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView myText1;
        TextView myText2;
        CardView cardview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            myText1 = itemView.findViewById(R.id.userName);
            myText2 = itemView.findViewById(R.id.userBirthday);
            cardview = itemView.findViewById(R.id.cardLayout);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");

            int position = this.getAdapterPosition();

            User current = users.get(position);

            String id = current.getId();

            Intent intent = new Intent(context, SurveyActivity.class);
            intent.putExtra("id", id);
            context.startActivity(intent);
        }
    }


}

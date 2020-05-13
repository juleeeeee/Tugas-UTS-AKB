package com.example.tugasakb;

// 11 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private Activity activity;
    private ArrayList id, name, email, phone;

    CustomAdapter(Activity activity, Context context, ArrayList id, ArrayList name, ArrayList email, ArrayList phone) {
        this.activity = activity;
        this.context = context;
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_friends, parent, false);
        return new MyViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.id_txt.setText(String.valueOf(id.get(position)));
        holder.name_txt.setText(String.valueOf(name.get(position)));
        holder.email_txt.setText(String.valueOf(email.get(position)));
        holder.phone_txt.setText(String.valueOf(phone.get(position)));

        holder.friendsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(id.get(position)));
                intent.putExtra("name", String.valueOf(name.get(position)));
                intent.putExtra("email", String.valueOf(email.get(position)));
                intent.putExtra("phone", String.valueOf(phone.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return id.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id_txt, name_txt, email_txt, phone_txt;
        LinearLayout friendsLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id_txt = itemView.findViewById(R.id.id_txt);
            name_txt = itemView.findViewById(R.id.name_txt);
            email_txt = itemView.findViewById(R.id.email_txt);
            phone_txt = itemView.findViewById(R.id.phone_txt);
            friendsLayout = itemView.findViewById(R.id.friendsLayout);

            Animation translate_anim = AnimationUtils.loadAnimation(context, R.anim.translate_anim);
            friendsLayout.setAnimation(translate_anim);
        }

    }
}

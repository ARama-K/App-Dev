package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Viewholder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameview,mailview;

    public Viewholder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.image);
        nameview=itemView.findViewById(R.id.name);
        mailview=itemView.findViewById(R.id.email);
    }
}

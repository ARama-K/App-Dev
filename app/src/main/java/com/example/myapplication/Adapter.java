package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.kotlinex.Employee;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Viewholder>{

    Context context;
    List<Employee> items;

    public Adapter(Context context, List<Employee> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(context).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.nameview.setText(items.get(position).getName());
        holder.mailview.setText(items.get(position).getPostalAddress());
        holder.imageView.setImageResource(items.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
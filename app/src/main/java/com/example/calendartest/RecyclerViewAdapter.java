package com.example.calendartest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Recycler;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    List<item> list;

    public RecyclerViewAdapter(List<item> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.dayOfWeek.setText(list.get(position).getDayOfWeek());
        holder.dayOfMonth.setText(list.get(position).getDayOfMonth());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    static class viewHolder extends RecyclerView.ViewHolder {
        TextView dayOfMonth;
        TextView dayOfWeek;

     public viewHolder(@NonNull View itemView) {
         super(itemView);

         dayOfMonth = itemView.findViewById(R.id.dayOfMonth);
         dayOfWeek = itemView.findViewById(R.id.dayOfWeek);
     }
 }
}

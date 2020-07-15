package com.example.t10async_r;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myHolder> {
    Context ct;
    List<Covid_cases> Cov;
    public MyAdapter(Context ct, List<Covid_cases> Cov)
    {
        this.ct = ct;
        this.Cov = Cov;
    }

    @NonNull
    @Override
    public MyAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ct).inflate(R.layout.item, parent, false);
        myHolder holder = new myHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.myHolder holder, int position)
    {
        Covid_cases cov = Cov.get(position);
        holder.date.setText(cov.getDate());
        holder.active.setText(cov.getActive());
        holder.recovered.setText(cov.getRecovered());
        holder.death.setText(cov.getDeath());
    }

    @Override
    public int getItemCount() {
        return Cov.size();
    }

    public class myHolder extends RecyclerView.ViewHolder
    {
        TextView active, date, recovered, death;
        public myHolder(@NonNull View itemView)
        {
            super(itemView);
            active = itemView.findViewById(R.id.active);
            date = itemView.findViewById(R.id.date);
            recovered = itemView.findViewById(R.id.recovered);
            death = itemView.findViewById(R.id.death);
        }
    }
}

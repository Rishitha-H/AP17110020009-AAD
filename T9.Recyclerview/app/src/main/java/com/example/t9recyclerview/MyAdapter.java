package com.example.t9recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

    int myImages[];
    String myNames[],myNumbers[],myLevels[],myDates[];
    Context ct;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names, String[] numbers, String[] level, String[] dates) {
        myImages = images;
        myNames = names;
        myNumbers=numbers;
        myLevels=level;
        myDates=dates;
        ct = mainActivity;

    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tvn.setText("Code Name : "+ myNames[position]);
        holder.tvu.setText("Version Number : "+ myNumbers[position]);
        holder.tvl.setText("API Level : "+ myLevels[position]);
        holder.tvd.setText("Release Date : "+ myDates[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tvn,tvu,tvl,tvd;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.poster);
            tvn = itemView.findViewById(R.id.pname);
            tvu = itemView.findViewById(R.id.pnum);
            tvl = itemView.findViewById(R.id.plev);
            tvd = itemView.findViewById(R.id.pdate);

        }
    }
}

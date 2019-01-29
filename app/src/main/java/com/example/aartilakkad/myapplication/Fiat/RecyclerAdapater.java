package com.example.aartilakkad.myapplication.Fiat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aartilakkad.myapplication.R;

import java.util.ArrayList;

public class RecyclerAdapater extends RecyclerView.Adapter<RecyclerAdapater.ItemViewHolder> {
    Context context;
    ArrayList<model_task> lists;

    public RecyclerAdapater(Context context, ArrayList<model_task> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.row,parent,false);
        return new RecyclerAdapater.ItemViewHolder(view);


    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        model_task list=lists.get(position);
        holder.img.setImageResource(list.getImage());
        holder.no.setText(list.getNo());
        holder.date.setText(list.date);
        holder.time.setText(list.getTime());
        holder.address.setText(list.getAddress());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hiiii", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder
    {
        TextView no,date,time,address;
        ImageView img;
        LinearLayout layout;

        public ItemViewHolder(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            no=itemView.findViewById(R.id.no);
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.time);
            address=itemView.findViewById(R.id.address);
            layout=itemView.findViewById(R.id.linear);

        }
    }
}

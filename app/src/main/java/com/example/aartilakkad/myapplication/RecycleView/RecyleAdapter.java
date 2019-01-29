package com.example.aartilakkad.myapplication.RecycleView;

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

public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.ItemViewHolder> {
   Context context;
   ArrayList<model> itemModels;

   public RecyleAdapter(Context context, ArrayList<model> itemModels) {
       this.context = context;
       this.itemModels = itemModels;
   }

   @Override
   public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View view = inflater.inflate(R.layout.raw_layout, parent, false);
       return new ItemViewHolder(view);

   }

   @Override
   public void onBindViewHolder(ItemViewHolder holder, int position) {

       final model itemModal = itemModels.get(position);

       holder.tv.setText(itemModal.getI_name());
       holder.img.setImageResource(itemModal.getImage());
       holder.lv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, itemModal.getI_name(), Toast.LENGTH_LONG).show();
           }
       });
   }

   @Override
   public int getItemCount() {
       return itemModels.size();    }

   public class ItemViewHolder extends RecyclerView.ViewHolder {
       TextView tv;
       ImageView img;
       LinearLayout lv;

       public ItemViewHolder(View itemView) {
           super(itemView);

           tv = (TextView) itemView.findViewById(R.id.tv);
           lv = (LinearLayout) itemView.findViewById(R.id.lv);
           img = (ImageView) itemView.findViewById(R.id.img);
       }
   }
}

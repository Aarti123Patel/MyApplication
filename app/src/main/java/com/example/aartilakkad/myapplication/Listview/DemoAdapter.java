package com.example.aartilakkad.myapplication.Listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aartilakkad.myapplication.R;

import java.util.ArrayList;

public class DemoAdapter extends ArrayAdapter<model_class> {

    int layoutid;
    Context context;
    ArrayList<model_class> itemModels;


    public DemoAdapter(@NonNull Context context, int layoutid, ArrayList<model_class> itemModels) {
        super(context, layoutid, itemModels);
        this.context=context;
        this.layoutid = layoutid;
        this.itemModels = itemModels;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        model_class data= itemModels.get(position);

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(layoutid, parent, false);
            viewHolder.tv = convertView.findViewById(R.id.tv);
            viewHolder.img = convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv.setText(data.getI_name());
        viewHolder.img.setImageResource(data.getImage());
        return convertView;
    }

    private static class ViewHolder {
        TextView tv;
        ImageView img;
    }
}







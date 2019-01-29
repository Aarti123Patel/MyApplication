package com.example.aartilakkad.myapplication.RecycleView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aartilakkad.myapplication.R;

import java.util.ArrayList;

public class



RecycleActivity extends AppCompatActivity {

    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rc=(RecyclerView)findViewById(R.id.recycleview);
        rc.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        ArrayList<model> itemModals=new ArrayList<model>();
        for(int i=0;i<10;i++){
            itemModals.add(new model(R.drawable.download,"android"));
        }
        RecyleAdapter adpt=new RecyleAdapter(this,itemModals);
        rc.setAdapter(adpt);

    }
}

package com.example.aartilakkad.myapplication.Fiat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aartilakkad.myapplication.R;

import java.util.ArrayList;

public  class FiatRecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = (RecyclerView) findViewById(R.id.frv);

        ArrayList<model_task> lists = new ArrayList<model_task>();

        recyclerView.setLayoutManager(new LinearLayoutManager(FiatRecyclerActivity.this));

        model_task modal[] = {
                new model_task(R.drawable.download, "1234", "9:52", "31/12/2018", "1600 Amphitheatre Pkwy,Mountain View,CA 94043,USA"),
                new model_task(R.drawable.download, "1234", "10:00", "12/11/2018", "No.105,1st Floor,Parshwa Complex,S.G. Highway,Bodakdev,Ahmedabad,Gujarat,India"),
                new model_task(R.drawable.download, "1234", "05:08", "30/09/2018", "3 Stonehenge Rd,Salisbury SP47DD,UK"),
                new model_task(R.drawable.download, "1234", "11:52", "21/07/2018", "1400 Mountain View,CA 94043,USA")
        };

        for (int i = 0; i < modal.length; i++) {
            lists.add(modal[i]);
        }
        RecyclerAdapater adp = new RecyclerAdapater(this,lists);
        recyclerView.setAdapter(adp);
    }


}

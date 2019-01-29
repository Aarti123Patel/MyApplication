package com.example.aartilakkad.myapplication.Listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.aartilakkad.myapplication.R;

import java.util.ArrayList;

public class Main12Activity extends AppCompatActivity {
    ListView listView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        listView = (ListView) findViewById(R.id.Listview2);

        ArrayList<model_class> model_classes = new ArrayList<model_class>();


        for (int i=0; i<20; i++){
            model_classes.add(new model_class(R.drawable.logo,"aarti"));

        }

        DemoAdapter demoAdapter=new DemoAdapter(this,R.layout.raw_layout,model_classes);
        listView.setAdapter((ListAdapter) demoAdapter);









    }
}

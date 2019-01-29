package com.example.aartilakkad.myapplication.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aartilakkad.myapplication.R;

public class fragmentActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction transaction;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        manager=getSupportFragmentManager();
    }

    public void addA(View view) {
        blankFragment=new BlankFragment();
        transaction=manager.beginTransaction();
        transaction.add(R.id.frame,blankFragment,"A");
        transaction.addToBackStack("addA");
        transaction.commit();

        }

    public void addB(View view) {
        blankFragment2=new BlankFragment2();
        transaction=manager.beginTransaction();
        transaction.add(R.id.frame,blankFragment2,"B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void Remove(View view) {
        blankFragment=new BlankFragment();
        transaction=manager.beginTransaction();
        transaction.remove(blankFragment3);
        transaction.addToBackStack("addA");
        transaction.commit();

    }

    public void Replace(View view) {
        blankFragment2=new BlankFragment2();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.frame,blankFragment2,"B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }
}

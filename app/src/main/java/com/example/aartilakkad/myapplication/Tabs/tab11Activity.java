package com.example.aartilakkad.myapplication.Tabs;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aartilakkad.myapplication.R;
import com.example.aartilakkad.myapplication.fragment.BlankFragment;
import com.example.aartilakkad.myapplication.fragment.BlankFragment2;
import com.example.aartilakkad.myapplication.fragment.BlankFragment3;

public class tab11Activity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    FragmentManager fragmentManager;
    TabLayout tabLayout;
    ViewPager viewPager;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab11);
        tabLayout=(TabLayout)findViewById(R.id.tab);
        viewPager=(ViewPager)findViewById(R.id.view);

        fragmentManager=getSupportFragmentManager();

        viewPager.setAdapter(new tab11Activity.adapter(fragmentManager));
        tabLayout.setOnTabSelectedListener(this);

        tabLayout.setOnTabSelectedListener(this);




    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager fm) {
            super(fm);

            }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            if (i==0) {
                fragment=new BlankFragment();
            }
            if (i==1)

            {
                fragment=new BlankFragment2();
            }
            if (i==2)
            {
                fragment=new BlankFragment3();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}

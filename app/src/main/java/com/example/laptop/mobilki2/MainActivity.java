package com.example.laptop.mobilki2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.adapter = new MyAdapter(getSupportFragmentManager());
        viewPager = (ViewPager)findViewById(R.id.container);
        setupViewPager(viewPager);
    }
    public void setupViewPager(ViewPager viewPager){
        adapter.addFragment(new Fragment0());
        adapter.addFragment(new Fragment1());
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int i){
        viewPager.setCurrentItem(i);
    }
}

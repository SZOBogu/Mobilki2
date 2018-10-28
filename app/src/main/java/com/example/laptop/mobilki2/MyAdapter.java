package com.example.laptop.mobilki2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragList = new ArrayList<>();

    public MyAdapter(FragmentManager fm){
        super(fm);
    }

    public void addFragment(Fragment frag){
        fragList.add(frag);
    }

    @Override
    public Fragment getItem(int i) {
        return fragList.get(i);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }
}

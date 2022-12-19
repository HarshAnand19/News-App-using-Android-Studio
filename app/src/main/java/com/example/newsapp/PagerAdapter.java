package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
   int tabcount;

    public PagerAdapter(@NonNull  FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch(position){
           case 0:
               return new HomeFragment();
           case 1:
               return new HealthFragment();
           case 2:
               return new TechnologyFragment();
           case 3:
               return new ScienceFragment();
           case 4:
               return new SportsFragment();
           case 5:
               return new EntertainmentFragment();
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
       return tabcount;
    }
}

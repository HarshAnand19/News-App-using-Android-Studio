package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem mhome,mhealth,mtech,mscience,msports,mentertainment;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api="d24aad30d91c40a08c31920d5469fee0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

mtoolbar=findViewById(R.id.toolbar);
setSupportActionBar(mtoolbar);

mhome=findViewById(R.id.home);
mhealth=findViewById(R.id.health);
mtech=findViewById(R.id.technology);
mscience=findViewById(R.id.science);
msports=findViewById(R.id.sports);
mentertainment=findViewById(R.id.entertainment);

        ViewPager viewPager=findViewById(R.id.fragmentContainer);
        tabLayout=findViewById(R.id.include);

        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0 || tab.getPosition() == 1|| tab.getPosition() == 2 || tab.getPosition() == 3|| tab.getPosition() == 4|| tab.getPosition() == 5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
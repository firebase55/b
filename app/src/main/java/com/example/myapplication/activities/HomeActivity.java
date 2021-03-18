package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.adpaters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tabLayout = findViewById(R.id.tab_layout_home);
        viewPager = findViewById(R.id.view_pager_home);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),HomeActivity.this));
        tabLayout.setupWithViewPager(viewPager);

    }
}
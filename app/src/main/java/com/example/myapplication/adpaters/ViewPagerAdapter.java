package com.example.myapplication.adpaters;

import android.content.Context;

import com.example.myapplication.R;
import com.example.myapplication.fragments.ConvoyFragment;
import com.example.myapplication.fragments.HistoryFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] childFragments;
    Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        childFragments = new Fragment[]{
                new ConvoyFragment(),
                new HistoryFragment()
        };
    }

    @Override
    public Fragment getItem(int position) {
        return childFragments[position];
    }

    @Override
    public int getCount() {
        return childFragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Convoy";
        } else if (position == 1) {
            return "History";
        }
        return null;
    }
}

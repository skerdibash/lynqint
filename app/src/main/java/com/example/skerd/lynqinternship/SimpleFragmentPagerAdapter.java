package com.example.skerd.lynqinternship;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by skerd on 21-May-18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFragment();
        } else if (position == 1){
            return new SecondFragment();
        } else if (position == 2){
            return new ThirdFragment();
        } else {
            return new FourthFragment();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 4;
    }

}
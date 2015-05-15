package com.example.thang.mobile_dating_app_v20.SlidingTab;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Thang on 5/15/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    String title[];
    public ViewPagerAdapter(FragmentManager fm, String mTitle[]){
        super(fm);
        this.title = mTitle;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new Tab1();
        }else if(position == 1){
            return  new Tab2();
        }else {
            return new Tab3();
        }
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}

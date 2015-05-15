package com.example.thang.mobile_dating_app_v20.Fragments;

import com.example.thang.mobile_dating_app_v20.R;
import com.example.thang.mobile_dating_app_v20.SlidingTab.SlidingTabLayout;
import com.example.thang.mobile_dating_app_v20.SlidingTab.ViewPagerAdapter;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Thang on 5/15/2015.
 */
public class Home extends Fragment {
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    String titles[];
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup v =(ViewGroup)inflater.inflate(R.layout.homefragment,container,false);
        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        //View v = inflater.inflate(R.layout.homefragment,container,false);

        titles = getResources().getStringArray(R.array.sliding_tab_titles);
        adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(),titles);

        pager = (ViewPager)v.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.AccentColor);
            }
        });
        tabs.setViewPager(pager);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Toolbar appbar = (Toolbar) getActivity().findViewById(R.id.tool_bar);
            appbar.setElevation(0);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Toolbar appbar = (Toolbar) getActivity().findViewById(R.id.tool_bar);
            appbar.setElevation((int) getResources().getDimension(R.dimen.toolbar_elevation));
        }
    }
}

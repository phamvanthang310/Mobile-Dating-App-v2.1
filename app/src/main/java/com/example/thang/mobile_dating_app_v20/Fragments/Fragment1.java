package com.example.thang.mobile_dating_app_v20.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.thang.mobile_dating_app_v20.R;
import com.getbase.floatingactionbutton.FloatingActionButton;


/**
 * Created by Thang on 5/14/2015.
 */
public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.floatbutton,container,false);
        FloatingActionButton buttonFloat = (FloatingActionButton)view.findViewById(R.id.fab_chat);
        buttonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked" , Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}

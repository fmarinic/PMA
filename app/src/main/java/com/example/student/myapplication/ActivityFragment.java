package com.example.student.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpageid);
    }
}

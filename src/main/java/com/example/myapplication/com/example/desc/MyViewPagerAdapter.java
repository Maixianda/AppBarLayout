package com.example.myapplication.com.example.desc;

import android.app.Fragment;
import android.app.FragmentManager;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/26.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/26 16:49
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}

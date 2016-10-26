package com.example.myapplication.com.example.desc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.lang.annotation.Retention;
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
        return fragments.size();
    }

    public void addFragment(Fragment fragment,String title)
    {
        if (null==fragment || null == title)
        {
            return;
        }
        fragments.add(fragment);
        titles.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}

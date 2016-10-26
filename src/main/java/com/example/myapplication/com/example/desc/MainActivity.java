package com.example.myapplication.com.example.desc;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.myapplication.R;
import com.example.myapplication.com.example.source.*;
import com.example.myapplication.databinding.DescActivityMainBinding;

/**
 * Created by Administrator on 2016/10/26.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/26 16:47
 */

public class MainActivity extends FragmentActivity {
    DescActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.desc_activity_main);

        fragment_one one = new fragment_one();
        fragment_two two = new fragment_two();
        fragment_three three = new fragment_three();

        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        myViewPagerAdapter.addFragment(one,"one");
        myViewPagerAdapter.addFragment(two,"two");
        myViewPagerAdapter.addFragment(three,"three");
        binding.viewpager.setAdapter(myViewPagerAdapter);

        binding.tablayout.addTab(binding.tablayout.newTab().setText("1"));
        binding.tablayout.addTab(binding.tablayout.newTab().setText("2"));
        binding.tablayout.addTab(binding.tablayout.newTab().setText("3"));
        binding.tablayout.setupWithViewPager(binding.viewpager);
    }
}

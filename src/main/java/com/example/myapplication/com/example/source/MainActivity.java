package com.example.myapplication.com.example.source;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.example.myapplication.R;
import com.example.myapplication.com.example.source.fragment.FragmentOne;
import com.example.myapplication.com.example.source.fragment.FragmentThree;
import com.example.myapplication.com.example.source.fragment.FragmentTwo;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolBar);
//        mToolbar.setTitleTextColor(Color.WHITE);//设置ToolBar的titl颜色
//        setSupportActionBar(mToolbar);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(FragmentOne.newInstance(), "TabOne");//添加Fragment
        viewPagerAdapter.addFragment(FragmentTwo.newInstance(), "TabTwo");
        viewPagerAdapter.addFragment(FragmentThree.newInstance(), "TabThree");
        mViewPager.setAdapter(viewPagerAdapter);//设置适配器

        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("TabOne"));//给TabLayout添加Tab
        mTabLayout.addTab(mTabLayout.newTab().setText("TabTwo"));
        mTabLayout.addTab(mTabLayout.newTab().setText("TabThree"));
        mTabLayout.setupWithViewPager(mViewPager);//给TabLayout设置关联ViewPager，如果设置了ViewPager，那么ViewPagerAdapter中的getPageTitle()方法返回的就是Tab上的标题
    }
}

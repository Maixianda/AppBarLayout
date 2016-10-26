package com.example.myapplication.com.example.desc;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.databinding.DescActivityMainBinding;

/**
 * Created by Administrator on 2016/10/26.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/26 16:47
 */

public class MainActivity extends Activity {
    DescActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DataBindingUtil.setContentView(this, R.layout.desc_activity_main);


    }
}

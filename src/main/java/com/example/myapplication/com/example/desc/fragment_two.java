package com.example.myapplication.com.example.desc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

/**
 * Created by Administrator on 2016/10/26.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/26 17:44
 */

public class fragment_two extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.desc_fragment, container, false);
        TextView mTextView = (TextView) view.findViewById(R.id.tv);
        mTextView.setText("这是第二个Fragment");
        return view;
    }
}

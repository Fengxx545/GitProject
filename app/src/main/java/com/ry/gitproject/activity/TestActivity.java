package com.ry.gitproject.activity;

import android.os.Bundle;

import com.ry.gitproject.R;
import com.ry.gitproject.base.ToolbarBaseActivity;

/**
 * Created by Hasee on 2018/10/20.
 */

public class TestActivity extends ToolbarBaseActivity {
    @Override
    protected String getSubTitle() {
        return "ceishi";
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activiy_test;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }
}

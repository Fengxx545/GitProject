package com.ry.gitproject;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ry.gitproject.activity.TestActivity;
import com.ry.gitproject.base.BaseActivity;
import com.ry.gitproject.util.ScreenUtil;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.toolbar_title)
    TextView mToolbar;
    @BindView(R.id.test)
    TextView mTest;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { // 4.4 以上版本
            // 设置 Toolbar 高度为 80dp，适配状态栏
            ViewGroup.LayoutParams layoutParams = mToolbar.getLayoutParams();
//            layoutParams.height = ScreenUtil.dip2px(this,ScreenUtil.getStatusBarHeight(this));
            layoutParams.height = ScreenUtil.dip2px(this,80);
            mToolbar.setLayoutParams(layoutParams);
        }
    }

    @Override
    protected boolean translucentStatusBar() {
        return true;
    }

    @Override
    protected int setStatusBarColor() {
        return R.color.colorPrimaryDark;
    }

    @OnClick(R.id.test)
    public void testClick(){
        startActivity(new Intent(this, TestActivity.class));
    }
}

package com.ry.gitproject.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ry.gitproject.R;
import com.ry.gitproject.adapter.TestAdapter;
import com.ry.gitproject.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Hasee on 2018/10/20.
 */

public class CoordinateTestActivity extends BaseActivity {


    @BindView(R.id.rvToDoList)
    RecyclerView mRvToDoList;
    @BindView(R.id.floatbt)
    FloatingActionButton mFloatbt;

    private TestAdapter mTestAdapter;
    private List<String> data = new ArrayList<>();

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_coordinate_test;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        for (int i = 0; i<= 100; i++){
            data.add("我是第"+i+"个哈哈哈");
        }
        mTestAdapter = new TestAdapter(data);
        mRvToDoList.setAdapter(mTestAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRvToDoList.setLayoutManager(layoutManager);
    }

    @Override
    protected boolean translucentStatusBar() {
        return true;
    }

    @OnClick(R.id.floatbt)
    public void onViewClicked() {
    }






}

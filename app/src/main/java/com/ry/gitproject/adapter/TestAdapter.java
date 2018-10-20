package com.ry.gitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Hasee on 2018/10/20.
 */

public class TestAdapter extends RecyclerView.Adapter {


    private List<String> data;

    public TestAdapter(List<String> list) {
        data = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        public Holder(View itemView) {
            super(itemView);
            init(itemView);
        }

        private void init(View itemView) {


        }


    }

}

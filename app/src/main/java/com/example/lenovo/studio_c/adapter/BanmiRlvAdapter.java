package com.example.lenovo.studio_c.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.lenovo.studio_c.bean.MiBean;

import java.util.ArrayList;

/**
 * Created by 003 on 2019/5/26.
 */

public class BanmiRlvAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private final ArrayList<MiBean.ResultBean> mList;

    public BanmiRlvAdapter(Context context, ArrayList<MiBean.ResultBean> list) {

        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

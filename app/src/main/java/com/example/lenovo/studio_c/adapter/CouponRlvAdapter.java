package com.example.lenovo.studio_c.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.activity.CouponActivity;
import com.example.lenovo.studio_c.activity.CouponDetailActivity;
import com.example.lenovo.studio_c.bean.CouponBean;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

/**
 * Created by 003 on 2019/5/23.
 */

public class CouponRlvAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private final ArrayList<CouponBean> mList;

    public CouponRlvAdapter(Context context, ArrayList<CouponBean> list) {

        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.money_item, parent, false);
            return new Vh(inflate);
        } else {
            View inflate = LayoutInflater.from(mContext).inflate(R.layout.money_guoqi_item, parent, false);
            return new Vh2(inflate);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        if (viewType == 1) {
            Vh holder1 = (Vh) holder;
            CouponBean bean = mList.get(position);
            holder1.mImg.setImageResource(bean.getImg());
            holder1.mName.setText(bean.getName());
            holder1.mTime.setText(bean.getTime());
            holder1.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, CouponDetailActivity.class);
                    mContext.startActivity(intent);
                }
            });
        } else {
            Vh2 holder2 = (Vh2) holder;
            CouponBean bean = mList.get(position);
            holder2.mImg.setImageResource(R.mipmap.icon_me_kaquan_banmi2);
            holder2.mName.setText(bean.getName());
            holder2.mTime.setText(bean.getTime());
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position < 3) {
            return 1;
        } else {
            return 2;
        }

    }

    class Vh extends RecyclerView.ViewHolder {

        private final ImageView mImg;
        private final TextView mName;
        private final TextView mTime;

        public Vh(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.money_img);
            mName = itemView.findViewById(R.id.money_name);
            mTime = itemView.findViewById(R.id.money_time);
        }
    }

    class Vh2 extends RecyclerView.ViewHolder {

        private final ImageView mImg;
        private final TextView mName;
        private final TextView mTime;

        public Vh2(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.money_img);
            mName = itemView.findViewById(R.id.money_name);
            mTime = itemView.findViewById(R.id.money_time);
        }
    }
}

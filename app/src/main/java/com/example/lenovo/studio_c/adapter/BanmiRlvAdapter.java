package com.example.lenovo.studio_c.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.bean.MiBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 003 on 2019/5/26.
 */

public class BanmiRlvAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private final ArrayList<MiBean.ResultBean.BanmiBean> mList;

    public BanmiRlvAdapter(Context context, ArrayList<MiBean.ResultBean.BanmiBean> list) {

        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.banmi_item, parent,false);
        return new Vh(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       Vh holder1 = (Vh) holder;
        MiBean.ResultBean.BanmiBean bean = mList.get(position);
        holder1.mAddress.setText(bean.getLocation());
        holder1.mName.setText(bean.getName());
        Glide.with(mContext).load(bean.getPhoto()).into(holder1.mImg);
        holder1.mType.setText(bean.getOccupation());
        holder1.mNum.setText("200人关注");
    }
//jjjjjiii
    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addData(MiBean.ResultBean result) {
        mList.addAll(result.getBanmi());
        notifyDataSetChanged();
    }

    class Vh extends RecyclerView.ViewHolder {

        private final ImageView mImg;
        private final TextView mName;
        private final TextView mNum;
        private final TextView mAddress;
        private final TextView mType;

        public Vh(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.mi_img);
            mName = itemView.findViewById(R.id.mi_name);
            mNum = itemView.findViewById(R.id.mi_num);
            mAddress = itemView.findViewById(R.id.mi_address);
            mType = itemView.findViewById(R.id.mi_type);
        }
    }
}

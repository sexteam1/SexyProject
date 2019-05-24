package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.adapter.CouponRlvAdapter;
import com.example.lenovo.studio_c.bean.CouponBean;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CouponFragment extends Fragment {


    private View view;
    private RecyclerView mMoneyRlv;
    private ArrayList<CouponBean> mList;

    public CouponFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_coupon, container, false);
        initView(inflate);
        return inflate;
    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            mList.add(new CouponBean("伴米旅行", R.mipmap.icon_me_kaquan_banmi1, 20, "有效期至: 2017-11-1"));
        }
    }

    private void initView(View inflate) {
        mMoneyRlv = (RecyclerView) inflate.findViewById(R.id.money_rlv);
        initData();
        mMoneyRlv.setLayoutManager(new LinearLayoutManager(getContext()));
        CouponRlvAdapter adapter = new CouponRlvAdapter(getContext(), mList);
        mMoneyRlv.setAdapter(adapter);
}
}

package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.adapter.BanmiRlvAdapter;
import com.example.lenovo.studio_c.base.BaseFragment;
import com.example.lenovo.studio_c.bean.MiBean;
import com.example.lenovo.studio_c.fragment.Attention.AttentionP;
import com.example.lenovo.studio_c.fragment.Attention.AttentionV;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends BaseFragment<AttentionV, AttentionP> implements AttentionV {


    @BindView(R.id.atten_img)
    ImageView mAttenImg;
    @BindView(R.id.atten_email)
    ImageView mAttenEmail;
    @BindView(R.id.atten_toolbar)
    Toolbar mAttenToolbar;
    @BindView(R.id.atten_rlv)
    RecyclerView mAttenRlv;
    Unbinder unbinder;
    private BanmiRlvAdapter mAdapter;

    @Override
    protected void initListener() {
/*        mPresenter*/
    }


    @Override
    protected void initView() {
        mAttenRlv.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<MiBean.ResultBean> list = new ArrayList<>();
        mAdapter = new BanmiRlvAdapter(getContext(),list);
        mAttenRlv.setAdapter(mAdapter);
    }

    @Override
    protected AttentionP initPresenter() {
        return new AttentionP();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_attention;
    }


    @Override
    public void onSuccess(MiBean bean) {

    }

    @Override
    public void onFail(String s) {

    }
}

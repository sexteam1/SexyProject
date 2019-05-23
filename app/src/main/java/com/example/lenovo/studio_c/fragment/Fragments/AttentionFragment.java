package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.base.BaseFragment;
import com.example.lenovo.studio_c.fragment.Attention.AttentionP;
import com.example.lenovo.studio_c.fragment.Attention.AttentionV;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends BaseFragment<AttentionV,AttentionP> implements AttentionV {


    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected AttentionP initPresenter() {
        return new AttentionP();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_attention;
    }

}

package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.base.BaseFragment;
import com.example.lenovo.studio_c.fragment.Wan.WanP;
import com.example.lenovo.studio_c.fragment.Wan.WanV;

/**
 * A simple {@link Fragment} subclass.
 */
public class WanFragment extends BaseFragment<WanV,WanP> implements WanV {

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected WanP initPresenter() {
        return new WanP();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wan;
    }

}

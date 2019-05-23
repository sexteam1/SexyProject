package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.base.BaseFragment;
import com.example.lenovo.studio_c.fragment.Find.FindP;
import com.example.lenovo.studio_c.fragment.Find.FindV;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends BaseFragment<FindV,FindP> implements FindV {


    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected FindP initPresenter() {
        return new FindP();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_find;
    }

}

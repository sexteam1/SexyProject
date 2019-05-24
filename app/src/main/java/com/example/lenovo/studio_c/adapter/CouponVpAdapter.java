package com.example.lenovo.studio_c.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 003 on 2019/5/23.
 */

public class CouponVpAdapter extends FragmentPagerAdapter {
    private final ArrayList<String> mList;
    private final ArrayList<Fragment> mFragments;

    public CouponVpAdapter(FragmentManager fm, ArrayList<String> list, ArrayList<Fragment> fragments) {
        super(fm);
        mList = list;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }
}

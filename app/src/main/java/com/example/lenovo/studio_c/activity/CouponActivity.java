package com.example.lenovo.studio_c.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.adapter.CouponVpAdapter;
import com.example.lenovo.studio_c.fragment.Fragments.CouponFragment;

import java.util.ArrayList;

public class CouponActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mMoneyBack;
    private Toolbar mMoneyToolbar;
    private TabLayout mMonyTab;
    private ViewPager mMonyVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        initView();

    }

    private void initView() {
        mMoneyBack = (ImageView) findViewById(R.id.money_back);
        mMoneyToolbar = (Toolbar) findViewById(R.id.money_toolbar);
        mMonyTab = (TabLayout) findViewById(R.id.mony_tab);
        mMonyVp = (ViewPager) findViewById(R.id.mony_vp);
        mMoneyBack.setOnClickListener(this);
        mMoneyToolbar.setTitle(" ");
        setSupportActionBar(mMoneyToolbar);

        ArrayList<String> list = new ArrayList<>();
        list.add("礼品券");
        list.add("代金券");
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new CouponFragment());
        fragments.add(new CouponFragment());
        CouponVpAdapter adapter = new CouponVpAdapter(getSupportFragmentManager(), list, fragments);
        mMonyVp.setAdapter(adapter);
        mMonyTab.setupWithViewPager(mMonyVp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.money_back:
                finish();
                break;
        }
    }
}

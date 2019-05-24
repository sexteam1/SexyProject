package com.example.lenovo.studio_c.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.studio_c.R;

public class CouponDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mDetailBack;
    private Toolbar mMoneyToolbar;
    private ImageView mDetailImg;
    /**
     * 代金券码:abcdefg
     */
    private TextView mTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_detail);
        initView();
    }

    private void initView() {
        mDetailBack = (ImageView) findViewById(R.id.detail_back);
        mDetailBack.setOnClickListener(this);
        mMoneyToolbar = (Toolbar) findViewById(R.id.money_toolbar);
        mDetailImg = (ImageView) findViewById(R.id.detail_img);
        mTxt = (TextView) findViewById(R.id.txt);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.detail_back:
                finish();
                break;
        }
    }
}

package com.example.lenovo.studio_c.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.studio_c.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.btn_send_verif)
    Button btnSendVerif;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.um_wechat)
    ImageView umWechat;
    @BindView(R.id.tv_name)
    TextView tvName;

    /*UMAuthListener authListener = new UMAuthListener() {
     *//**
     * @desc 授权开始的回调
     * @param platform 平台名称
     *//*
        @Override
        public void onStart(SHARE_MEDIA platform) {
        }
        *//**
     * @desc 授权成功的回调
     * @param platform 平台名称
     * @param action 行为序号，开发者用不上
     * @param data 用户资料返回
     *//*
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            Toast.makeText(RegisterActivity.this, "成功了", Toast.LENGTH_LONG).show();
        }
        *//**
     * @desc 授权失败的回调
     * @param platform 平台名称
     * @param action 行为序号，开发者用不上
     * @param t 错误原因
     *//*
        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {
            Toast.makeText(RegisterActivity.this, "失败：" + t.getMessage(),                                     Toast.LENGTH_LONG).show();
        }
        */

    /**
     * @desc 授权取消的回调
     * //* @param platform 平台名称
     * //* @param action 行为序号，开发者用不上
     *//*
        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(RegisterActivity.this, "取消了", Toast.LENGTH_LONG).show();
        }
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        btnSendVerif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, CodeActivity.class);
                startActivity(intent);
            }
        });
        if (!TextUtils.isEmpty(etPhone.getText().toString())) {
            btnSendVerif.setBackgroundResource(R.drawable.button_unavailable);
        } else {
            btnSendVerif.setBackgroundResource(R.drawable.button_highlight);
        }

    }

    @OnClick({R.id.btn_send_verif, R.id.um_wechat, R.id.tv_name})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_send_verif:
                break;
            case R.id.um_wechat:
                Intent intent = new Intent(RegisterActivity.this, WechatActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_name:
                break;
        }
    }
}

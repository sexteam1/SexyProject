package com.example.lenovo.studio_c.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.lenovo.studio_c.R;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mDetailBack;
    private Toolbar mMoneyToolbar;
    /**
     * 请留下意见反馈
     */
    private EditText mFeedEd;
    /**
     * 提交
     */
    private Button mFeedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        initView();
    }

    private void initView() {
        mDetailBack = (ImageView) findViewById(R.id.detail_back);
        mMoneyToolbar = (Toolbar) findViewById(R.id.money_toolbar);
        mFeedEd = (EditText) findViewById(R.id.feed_ed);
        mFeedBtn = (Button) findViewById(R.id.feed_btn);
        mFeedBtn.setOnClickListener(this);

        String i = mFeedEd.getText().toString();
        if (i == null) {
            mFeedBtn.setBackgroundColor(getResources().getColor(R.color.Orange));
        }
        mDetailBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.feed_btn:
                break;
            case R.id.detail_back:
                finish();
                break;
        }
    }
}

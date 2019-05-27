package com.example.lenovo.studio_c.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.adapter.NotificationAdapter;
import com.example.lenovo.studio_c.bean.NotificationBean;
import com.example.lenovo.studio_c.weight.SimpleTouchHelperCallBack;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {

    private ImageView img_return;
    private TextView notification;
    private TextView remove;
    private Toolbar toolbar;
    private RecyclerView lv;
    private ArrayList<NotificationBean> list;
    private NotificationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        initData();
        initView();
    }

    private void initData() {
        list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            NotificationBean notificationBean = new NotificationBean("消息回复", "2017/10/21", "庸索恢复了你的前言");

            list.add(notificationBean);
        }
    }

    private void initView() {
        img_return = (ImageView) findViewById(R.id.img_return);
        notification = (TextView) findViewById(R.id.notification);
        remove = (TextView) findViewById(R.id.remove);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (RecyclerView) findViewById(R.id.lv);

        img_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        img_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        lv.setLayoutManager(linearLayoutManager);

        adapter = new NotificationAdapter(this, list);
        lv.setAdapter(adapter);


        SimpleTouchHelperCallBack simpleTouchHelperCallBack = new SimpleTouchHelperCallBack(adapter);

        ItemTouchHelper helper = new ItemTouchHelper(simpleTouchHelperCallBack);
        helper.attachToRecyclerView(lv);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(v);
            }
        });

    }
}
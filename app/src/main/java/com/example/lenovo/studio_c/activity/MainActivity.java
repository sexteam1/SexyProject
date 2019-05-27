package com.example.lenovo.studio_c.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.lenovo.studio_c.Main.MainP;
import com.example.lenovo.studio_c.Main.MainV;
import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.base.BaseActivity;
import com.example.lenovo.studio_c.fragment.Fragments.AttentionFragment;
import com.example.lenovo.studio_c.fragment.Fragments.FindFragment;
import com.example.lenovo.studio_c.fragment.Fragments.WanFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends BaseActivity<MainV, MainP> implements MainV {

    //jjjjjjjjj
    @BindView(R.id.mains_tooblar)
    Toolbar mMainTooblar;
    @BindView(R.id.main_fragment)
    FrameLayout mMainFragment;
    @BindView(R.id.main_tablay)
    TabLayout mMainTablay;
    int position1;
    @BindView(R.id.main_toobla_avatar)
    CircleImageView mMainTooblaAvatar;
    @BindView(R.id.main_toobla_envelope)
    ImageView mMainTooblaEnvelope;
    @BindView(R.id.main_toobla_bell)
    ImageView mMainTooblaBell;
    @BindView(R.id.head_image)
    CircleImageView mHeadImage;
    @BindView(R.id.heads_relati)
    CardView mHeadsRelati;
    @BindView(R.id.heads_card)
    RelativeLayout mHeadsCard;
    @BindView(R.id.heads_stroke)
    RelativeLayout mHeadsStroke;
    @BindView(R.id.heads_collect)
    RelativeLayout mHeadsCollect;
    @BindView(R.id.heads_atten)
    RelativeLayout mHeadsAtten;
    @BindView(R.id.heads_service)
    TextView mHeadsService;
    @BindView(R.id.heads_feedback)
    TextView mHeadsFeedback;
    @BindView(R.id.heads_detection)
    TextView mHeadsDetection;
    @BindView(R.id.main_navi)
    NavigationView mMainNavi;
    @BindView(R.id.dl)
    DrawerLayout mDl;

    private ArrayList<Fragment> fraglist = new ArrayList<>();
    private FragmentManager manager;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {
        mMainTooblar.setTitle("");
        setSupportActionBar(mMainTooblar);

        manager = getSupportFragmentManager();
        mMainTablay.setSelectedTabIndicatorHeight(0);
        initFragment();
        FragmentData();

        View tab = getTab(0);
        mMainTablay.addTab(mMainTablay.newTab().setCustomView(tab));
        View tab1 = getTab(1);
        mMainTablay.addTab(mMainTablay.newTab().setCustomView(tab1));
        View tab2 = getTab(2);
        mMainTablay.addTab(mMainTablay.newTab().setCustomView(tab2));


        mMainTablay.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                getFragmentData(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mMainTooblaAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDl.openDrawer(Gravity.LEFT);
            }
        });

    }

    private void FragmentData() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fragment, fraglist.get(0));
        transaction.commit();
    }

    private void initFragment() {
        fraglist.add(new WanFragment());
        fraglist.add(new FindFragment());
        fraglist.add(new AttentionFragment());


    }

    private View getTab(int position) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.tablalayout, null, false);
        ImageView image = inflate.findViewById(R.id.tabla_image);
        TextView text = inflate.findViewById(R.id.tabla_text);

        if (position == 0) {
            image.setImageResource(R.drawable.wan);
            text.setText(R.string.wan);
        } else if (position == 1) {
            text.setText(R.string.find);
        } else if (position == 2) {
            image.setImageResource(R.drawable.attention);
            text.setText(R.string.attention);
        }
        return inflate;

    }

    private void getFragmentData(int position) {
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = fraglist.get(position);
        if (!fragment.isAdded()) {
            transaction.add(R.id.main_fragment, fragment);
        }
        transaction.show(fragment);
        transaction.hide(fraglist.get(position1));
        transaction.commit();

        position1 = position;

    }


    @Override
    protected MainP initPresenter() {
        return new MainP();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @OnClick({R.id.main_toobla_avatar, R.id.main_toobla_envelope, R.id.main_toobla_bell, R.id.heads_relati, R.id.heads_card, R.id.heads_stroke, R.id.heads_collect, R.id.heads_atten, R.id.heads_service, R.id.heads_feedback, R.id.heads_detection})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.main_toobla_avatar:
                break;
            case R.id.main_toobla_envelope:
                Intent intent4 = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent4);
                break;
            case R.id.main_toobla_bell:
                Intent intent1 = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent1);
                break;
            case R.id.heads_relati:
                break;
            case R.id.heads_card:
                Intent intent = new Intent(this, CouponActivity.class);
                startActivity(intent);
                break;
            case R.id.heads_stroke:
                Intent intent2 = new Intent(MainActivity.this, AlreadyActivity.class);
                startActivity(intent2);
                break;
            case R.id.heads_collect:
                Intent intent3 = new Intent(MainActivity.this, CollectActivity.class);
                startActivity(intent3);
                break;
            case R.id.heads_atten:
                break;
            case R.id.heads_service:
                break;
            case R.id.heads_feedback:
                startActivity(new Intent(this, FeedbackActivity.class));
                break;
            case R.id.heads_detection:
                break;


        }
    }
}

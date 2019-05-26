package com.example.lenovo.studio_c.fragment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.adapter.BanmiRlvAdapter;
import com.example.lenovo.studio_c.base.ApiServer;
import com.example.lenovo.studio_c.base.BaseFragment;
import com.example.lenovo.studio_c.bean.MiBean;
import com.example.lenovo.studio_c.fragment.Attention.AttentionP;
import com.example.lenovo.studio_c.fragment.Attention.AttentionV;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends BaseFragment<AttentionV, AttentionP> {


/*    @BindView(R.id.atten_img)
    ImageView mAttenImg;
    @BindView(R.id.atten_email)
    ImageView mAttenEmail;
    @BindView(R.id.atten_toolbar)
    Toolbar mAttenToolbar;*/
    @BindView(R.id.atten_rlv)
    RecyclerView mAttenRlv;
    Unbinder unbinder;
    private BanmiRlvAdapter mAdapter;
    private String miurl = "JVy0IvZamK7f7FBZLKFtoniiixKMlnnJ6dWZ6NlsY4HGsxcAA9qvFo8yacHCKHE8YAcd0UF9L59nEm7zk9AUixee0Hl8EeWA880c0ikZBW0KEYuxQy5Z9NP3BNoBi3o3Q0g";
    private ArrayList<MiBean.ResultBean.BanmiBean> mList;

    @Override
    protected void initListener() {
/*        mPresenter*/
    }


    @Override
    protected void initView() {
        mAttenRlv.setLayoutManager(new LinearLayoutManager(getContext()));
        mList = new ArrayList<>();
        mAdapter = new BanmiRlvAdapter(getContext(), mList);
        mAttenRlv.setAdapter(mAdapter);
        initData();
    }

    private void initData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiServer.url).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        ApiServer server = retrofit.create(ApiServer.class);
        Observable<MiBean> observable = server.getMiBean(miurl);
        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<MiBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MiBean value) {
                        mAdapter.addData(value.getResult());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
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

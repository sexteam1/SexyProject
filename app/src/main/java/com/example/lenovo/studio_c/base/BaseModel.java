package com.example.lenovo.studio_c.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Lenovo on 2019/5/22.
 */

public class BaseModel {
    protected CompositeDisposable mComppst=new CompositeDisposable();

    public void onDestory() {
        mComppst.clear();
    }
}

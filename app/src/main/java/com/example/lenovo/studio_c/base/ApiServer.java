package com.example.lenovo.studio_c.base;

import com.example.lenovo.studio_c.bean.MiBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by 003 on 2019/5/26.
 */

public interface ApiServer {
    //https://api.banmi.com/api/3.0/banmi?page=2
    public String url = "https://api.banmi.com/api/3.0/";

    @GET("banmi?page=2")
    Observable<MiBean> getMiBean(@Header("token") String styp);


}

package com.example.lenovo.studio_c.fragment.Attention;

import com.example.lenovo.studio_c.base.BaseView;
import com.example.lenovo.studio_c.bean.MiBean;

/**
 * Created by Lenovo on 2019/5/22.
 */

public interface AttentionV extends BaseView {
    void onSuccess(MiBean bean);

    void onFail(String s);
}

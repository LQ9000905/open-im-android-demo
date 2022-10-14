package io.openim.android.ouicore.im;


import android.content.Intent;

import com.alibaba.android.arouter.launcher.ARouter;

import io.openim.android.ouicore.base.BaseApp;
import io.openim.android.ouicore.entity.LoginCertificate;
import io.openim.android.ouicore.net.RXRetrofit.HttpConfig;
import io.openim.android.ouicore.net.RXRetrofit.N;
import io.openim.android.ouicore.services.CallingService;
import io.openim.android.ouicore.utils.Constant;
import io.openim.android.ouicore.utils.Routes;
import io.openim.android.sdk.OpenIMClient;
import io.openim.android.sdk.listener.OnConnListener;

public class IM {
    public static void initSdk() {
        N.init(new HttpConfig().setBaseUrl(Constant.APP_AUTH_URL));
        ///IM 初始化
        OpenIMClient.getInstance().initSDK(2, Constant.IM_API_URL, Constant.IM_WS_URL, getStorageDir(), 1, "minio",
            "",IMEvent.getInstance().connListener);

        IMEvent.getInstance().init();
    }

    //存储路径
    public static String getStorageDir() {
        return BaseApp.inst().getFilesDir().getAbsolutePath();
    }
}

package com.nuoche.game;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import com.inveno.advert.wrap.AdvertHelper;
import com.inveno.advert.wrap.AdvertManager;

import demo.MainActivity;

public class App extends Application {

    public App() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            String processName = getProcessName();
            if (!getPackageName().equals(processName)) {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        AdvertManager.REWARD_AD_ID = "b67138d2d72714";        //激励视频广告码
        AdvertManager.FULL_AD_ID = "";        //全屏视频广告码
        AdvertManager.TABLE_AD_ID = "";        //插屏视频广告码
        AdvertManager.FEED_AD_ID = "";        //信息流广告码
        AdvertManager.BANNER_AD_ID = "";        //banner广告码
        AdvertManager.SPLASH_AD_ID = "";        //开屏视频广告码

        //如果用的是topon，则调用这个方法初始化
        AdvertManager.initTopOn(this,"a67138cb550a8f","a1635592f6b1671ae47e9e8859a6f51b6", true);
        AdvertManager.setLoadCallBack(new AdvertManager.LoadCallBack() {
            @Override
            public void onTableVideoLoad() {

            }

            @Override
            public void onRewardVideoLoad() {   //奖励视频加载成功

            }

            @Override
            public void onFullVideoLoad() {

            }
        });

        register();
    }

    private void register() {
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MainActivity) {
                    AdvertHelper.initRewardVideo(activity);
                }
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}

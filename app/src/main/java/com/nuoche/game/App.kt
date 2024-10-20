package com.nuoche.game

import android.app.Application
import android.os.Build
import android.webkit.WebView
import com.inveno.advert.wrap.AdvertManager

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val processName = getProcessName()
            if (!packageName.equals(processName)) {
                WebView.setDataDirectorySuffix(processName)
            }
        }
        AdvertManager.REWARD_AD_ID = ""        //激励视频广告码
        AdvertManager.FULL_AD_ID = ""        //全屏视频广告码
        AdvertManager.TABLE_AD_ID = ""        //插屏视频广告码
        AdvertManager.FEED_AD_ID = ""        //信息流广告码
        AdvertManager.BANNER_AD_ID = ""        //banner广告码
        AdvertManager.SPLASH_AD_ID = ""        //开屏视频广告码

        //如果用的是topon，则调用这个方法初始化
        AdvertManager.initTopOn(this,"appId","appKey", true)
    }
}
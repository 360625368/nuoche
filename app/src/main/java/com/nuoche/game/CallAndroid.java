package com.nuoche.game;

import com.inveno.advert.wrap.AdvertHelper;
import com.inveno.advert.wrap.AdvertManager;
import com.inveno.advert.wrap.listener.VideoCallBack;

public class CallAndroid {

    public void initTopOn() {
        //如果用的是topon，则调用这个方法初始化
        if (App.mainActivity == null)
            return;
        AdvertManager.initTopOn(App.mainActivity.getApplication(),"a67138cb550a8f","a1635592f6b1671ae47e9e8859a6f51b6", true);
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
    }

    public void initRewardVideo() {
        if (App.mainActivity == null)
            return;
        AdvertHelper.initRewardVideo(App.mainActivity);
    }

    public void startRewardVideo(){
        boolean showResult = AdvertHelper.showRewardVideo(new VideoCallBack() {
            @Override
            public void onVideoShow() { //视频开始播放

            }

            @Override
            public void onVideoClose() {    //关闭视频

            }

            @Override
            public void onVideoClick() {    //点击视频

            }

            @Override
            public void onVideoReward(boolean flag) {   //视频达到可以获取奖励的时长

            }

            @Override
            public void onVideoComplete() { //视频播放完毕

            }

            @Override
            public void onError(String code, String msg) {  //加载视频出错

            }
        });
    }
}

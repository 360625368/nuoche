package com.nuoche.game;

import com.inveno.advert.wrap.AdvertHelper;
import com.inveno.advert.wrap.listener.VideoCallBack;

public class CallAndroid {

    public void startRewardVideo(){
        AdvertHelper.showRewardVideo(new VideoCallBack() {
            @Override
            public void onVideoShow() {

            }

            @Override
            public void onVideoClose() {

            }

            @Override
            public void onVideoClick() {

            }

            @Override
            public void onVideoReward(boolean flag) {

            }

            @Override
            public void onVideoComplete() {

            }

            @Override
            public void onError(String code, String msg) {

            }
        });
    }
}

package com.nuoche.game;

import com.inveno.advert.wrap.AdvertHelper;
import com.inveno.advert.wrap.listener.VideoCallBack;

public class CallAndroid {

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

package com.dingbiye.tts;

import android.app.Application;
import android.util.Log;

import com.baidu.tts.client.TtsMode;
import com.dingbiye.libtts.utilTts.TtsUtil;

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String appID = "22331118";
        String appKey = "2ssYVd6vlefNHESo81awirKZ";
        String secretKey = "Ri75cTGEGqd3bSYlpQG9jCdnpZW1gNhd";
        try {
            TtsUtil.getInstance().initialTts(this, appID, appKey, secretKey, TtsMode.MIX);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("tts", e.getMessage());
        }
    }
}

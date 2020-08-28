package com.dingbiye.tts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dingbiye.libtts.utilTts.TtsUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

    }

    private void initEvent() {
        tv_speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TtsUtil.getInstance().speak("你好，一行实现语音的集成方式来了");
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.i("tts", e.getMessage());
                }
            }
        });
    }

    private TextView tv_speak;
    private void initView() {
        tv_speak = findViewById(R.id.tv_speak);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TtsUtil.getInstance().release();
    }
}
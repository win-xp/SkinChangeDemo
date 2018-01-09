package com.example.xuxiaopeng.skinchangedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import skin.support.SkinCompatManager;

public class MainActivity extends AppCompatActivity {

    private boolean isDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDefault) {
                    isDefault = false;
                    SkinCompatManager.getInstance().loadSkin("pig", SkinCompatManager.SKIN_LOADER_STRATEGY_BUILD_IN);
                } else {
                    isDefault = true;
                    SkinCompatManager.getInstance().restoreDefaultTheme();
                }
            }
        });
    }
}

package com.downloadtool.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.downloadtool.R;

/**
 * @auther HuangYuGuang
 * @date 2018/7/20.
 */

public class NoNetworkActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonetwork);
    }
}

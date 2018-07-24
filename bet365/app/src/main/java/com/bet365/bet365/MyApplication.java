package com.bet365.bet365;

import android.app.Application;

import com.mastersdk.android.NewMasterSDK;

import java.util.ArrayList;

/**
 * Created by Gan on 2018/7/2.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Class<?> arg0=MainActivity.class;
        ArrayList<String> arg1=new ArrayList<>();
        arg1.add("http://abc.test1.com:9991");
        arg1.add("http://abc.test1.com:9991");
        Application arg2=this;
        NewMasterSDK.init(arg0,arg1,arg2);
    }
}

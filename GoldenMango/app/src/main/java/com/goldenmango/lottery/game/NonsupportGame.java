package com.goldenmango.lottery.game;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.goldenmango.lottery.base.net.GsonHelper;
import com.goldenmango.lottery.data.Lottery;
import com.goldenmango.lottery.data.Method;

/**
 * 不支持的游戏
 * Created by Alashi on 2016/2/17.
 */
public class NonsupportGame extends Game{
    public NonsupportGame(Activity activity, Method method, Lottery lottery) {
        super(activity,method,lottery);
    }

    @Override
    public void onInflate() {
        Log.w("NonsupportGame", "onInflate: " + GsonHelper.toJson(method));
        Toast.makeText(topLayout.getContext(), "不支持的类型", Toast.LENGTH_LONG).show();
    }
}

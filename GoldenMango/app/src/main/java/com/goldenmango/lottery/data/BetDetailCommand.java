package com.goldenmango.lottery.data;

import com.goldenmango.lottery.base.net.RequestConfig;
import com.google.gson.annotations.SerializedName;

/**
 * 订单详情
 * Created by Alashi on 2016/1/21.
 */
@RequestConfig(api = "service?packet=Game&action=getProjectDetail")
public class BetDetailCommand {
    private int id;
    private String token;

    public void setId(int id) {
        this.id = id;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

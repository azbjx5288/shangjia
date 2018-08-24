package com.goldenmango.lottery.data;

import com.goldenmango.lottery.base.net.RequestConfig;

/**
 * Banner列表
 * Created by Alashi on 2016/1/19.
 */
@RequestConfig(api = "service?packet=Notice&action=getBannerList")
public class BannerListCommand {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }
}

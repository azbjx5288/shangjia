package com.goldenmango.lottery.data;

import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RequestConfig;

/**
 * 当前用户所有信息查询
 * Created by Alashi on 2016/1/28.
 */
@RequestConfig(api = "service?packet=User&action=getCurrentUserInfo", response = UserInfo.class)
public class UserInfoCommand {
    private String token= GoldenMangoApp.getUserCentre().getSession();
    public void setToken(String token) {
        this.token = token;
    }
}

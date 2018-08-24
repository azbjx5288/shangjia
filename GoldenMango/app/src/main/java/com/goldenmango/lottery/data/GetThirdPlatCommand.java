package com.goldenmango.lottery.data;


import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RequestConfig;

@RequestConfig(api = "service?packet=Game&action=GetThirdPlatList")
public class GetThirdPlatCommand{
    private String token= GoldenMangoApp.getUserCentre().getUserInfo().getToken();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

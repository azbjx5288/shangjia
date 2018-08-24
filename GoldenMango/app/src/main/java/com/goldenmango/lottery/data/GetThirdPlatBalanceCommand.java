package com.goldenmango.lottery.data;

import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RequestConfig;
import com.google.gson.annotations.SerializedName;

@RequestConfig(api = "service?packet=Fund&action=GetThirdPlatBalance")
public class GetThirdPlatBalanceCommand {
    @SerializedName("plat_id")
    private String platId;

    public void setPlatId(String platId) {
        this.platId = platId;
    }


    private String token= GoldenMangoApp.getUserCentre().getUserInfo().getToken();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

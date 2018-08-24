package com.goldenmango.lottery.data;

import com.android.volley.Request;
import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RequestConfig;
import com.google.gson.annotations.SerializedName;

@RequestConfig(api = "service?packet=Fund&action=PlatTransfer", method = Request.Method.POST)
public class TransferFundsCommand {
    private String token=GoldenMangoApp.getUserCentre().getUserInfo().getToken();
    @SerializedName("sign")
    private String sign;

    @SerializedName("amount")
    private int amount;
    @SerializedName("from_plat")
    private int fromPlat;
    @SerializedName("to_plat")
    private int toPlat;




    public void setFromPlat(int fromPlat) {
        this.fromPlat = fromPlat;
    }

    public void setToPlat(int toPlat) {
        this.toPlat = toPlat;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
}

package com.goldenmango.lottery.data;

import com.goldenmango.lottery.base.net.RequestConfig;

/**
 * Created by Ace.Dong on 2017/12/6.
 */
@RequestConfig(api = "service?packet=Fund&action=getDepositUrl")
public class RechargeUrlCommand {
    private String token;
    public void setToken(String token) {
        this.token = token;
    }
}

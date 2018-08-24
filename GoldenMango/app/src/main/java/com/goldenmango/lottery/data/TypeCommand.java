package com.goldenmango.lottery.data;

import com.goldenmango.lottery.base.net.RequestConfig;

/**
 * Created by ACE-PC on 2016/5/31.
 */
@RequestConfig(api = "service?packet=Fund&action=getTransactionTypeList")
public class TypeCommand {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }
}

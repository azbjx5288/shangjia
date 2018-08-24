package com.goldenmango.lottery.data;

import com.goldenmango.lottery.base.net.RequestConfig;

/**
 * Created by Ace.Dong on 2017/11/23.
 */
@RequestConfig(api = "service?packet=Game&action=getThirdLotteryLink&lottery=saba")
public class ThirdLotteryLinkCommand2 {
    private String token;
//    private String sign;
//
//    public void setSign(String sign) {
//        this.sign = sign;
//    }


    public void setToken(String token) {
        this.token = token;
    }
}

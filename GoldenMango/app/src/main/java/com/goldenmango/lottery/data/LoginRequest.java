package com.goldenmango.lottery.data;

import android.content.Context;

import com.android.volley.NetworkResponse;
import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RestRequest;
import com.goldenmango.lottery.base.net.RestResponse;
import com.goldenmango.lottery.user.UserCentre;

/**
 * Created by Alashi on 2016/1/6.
 */
public class LoginRequest extends RestRequest {
    public LoginRequest(Context context) {
        super(context);
    }

    @Override
    protected void onBackgroundResult(NetworkResponse networkResponse, RestResponse response) {
        UserCentre userCentre = GoldenMangoApp.getUserCentre();
        if (response.getErrno() != 0) {
            userCentre.saveSession(null);
            return;
        }
        userCentre.saveLoginInfo(((LoginCommand)command).getUsername(), ((LoginCommand)command).getPassword());
        userCentre.setUserInfo((UserInfo) response.getData());

        if (userCentre.getUserInfo().getToken() == null) {
            return;
        }
        userCentre.saveSession(userCentre.getUserInfo().getToken());
    }
}

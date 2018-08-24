package com.goldenmango.lottery.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldenmango.lottery.R;
import com.goldenmango.lottery.app.BaseFragment;
import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RestCallback;
import com.goldenmango.lottery.base.net.RestRequest;
import com.goldenmango.lottery.base.net.RestRequestManager;
import com.goldenmango.lottery.base.net.RestResponse;
import com.goldenmango.lottery.data.RequestUrl;
import com.goldenmango.lottery.data.ThirdLotteryLinkCommand2;
import com.google.gson.reflect.TypeToken;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created By Sakura
 */
public class SbFragment extends BaseFragment {
    private static final int THIRD_LOTTERY_TRACE_ID=1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sb_web_view, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.sb_button,R.id.loading_layout,R.id.sb_bg})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sb_button:
            case R.id.sb_bg:
            case R.id.loading_layout:
                ThirdLotteryLinkCommand2 command = new ThirdLotteryLinkCommand2();
                command.setToken(GoldenMangoApp.getUserCentre().getUserInfo().getToken());
                TypeToken typeToken = new TypeToken<RestResponse<RequestUrl>>() {
                };
                RestRequest restRequest = RestRequestManager.createRequest(getActivity(), command, typeToken, restCallback, THIRD_LOTTERY_TRACE_ID, this);
                restRequest.execute();
            break;
        }
    }

 private  void LoadWebview(String  url){
     Bundle bundle = new Bundle();
     bundle.putString("url", url);
     launchFragment(SbWebViewFragment.class, bundle);
 }

    private RestCallback restCallback = new RestCallback() {
        @Override
        public boolean onRestComplete(RestRequest request, RestResponse response) {
            switch (request.getId()) {
                case THIRD_LOTTERY_TRACE_ID:
                    RequestUrl requestUrl = (RequestUrl) response.getData();
                    if (!TextUtils.isEmpty(requestUrl.getRequestUrl())) {
                        LoadWebview(requestUrl.getRequestUrl());
                    } else {
                        LoadWebview("file:///android_asset/web/Error.html");
                    }
                    break;
            }
            return true;
        }

        @Override
        public boolean onRestError(RestRequest request, int errCode, String errDesc) {
            if (errCode == 3004 || errCode == 2016) {
                signOutDialog(getActivity(), errCode);
                return true;
            } else if (errCode == -3) {
                LoadWebview("file:///android_asset/web/Error.html");
                return true;
            }else{
                showToast(errDesc);
            }
            return false;
        }

        @Override
        public void onRestStateChanged(RestRequest request, @RestRequest.RestState int state) {
            if (state == RestRequest.RUNNING) {
                showProgress("加载中…");
            } else {
                hideProgress();
            }
        }
    };
}

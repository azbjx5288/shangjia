package com.goldenmango.lottery.game;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.goldenmango.lottery.app.FragmentLauncher;
import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.base.net.RestCallback;
import com.goldenmango.lottery.base.net.RestRequest;
import com.goldenmango.lottery.base.net.RestRequestManager;
import com.goldenmango.lottery.base.net.RestResponse;
import com.goldenmango.lottery.component.CustomDialog;
import com.goldenmango.lottery.component.DialogLayout;
import com.goldenmango.lottery.data.LogoutCommand;
import com.goldenmango.lottery.fragment.GoldenLogin;
import com.goldenmango.lottery.material.ShoppingCart;

/**
 * 提示信息的管理
 *
 * @author Ace
 */

public class PromptManager {

    private Activity activity;
    private static final int ID_LOGOUT = 1;

    public PromptManager(Activity activity) {
        this.activity = activity;

    }

    public static void showCustomDialog(CustomDialog.Builder builder) {
        builder.create().show();
    }

    public static void showCustomDialog(Context context, String msg) {
        CustomDialog.Builder builder = new CustomDialog.Builder(context);
        builder.setMessage(msg);
        builder.setTitle("温馨提示");
        builder.setLayoutSet(DialogLayout.SINGLE);
        builder.setPositiveButton("知道了", (dialog, which) -> dialog.dismiss());
        builder.create().show();
    }

    public static CustomDialog showCustomDialog(final Activity atv, String title, String msg, String butText, final int status) {
        final PromptManager promptManager=new PromptManager(atv);
        CustomDialog.Builder builder = new CustomDialog.Builder(atv);
        builder.setMessage(msg);
        builder.setTitle(title);
        builder.setLayoutSet(DialogLayout.SINGLE);
        builder.setPositiveButton(butText, (dialog, which) -> {
            if (status == 3004) {
                LogoutCommand logoutCommand=new LogoutCommand();
                logoutCommand.setToken(GoldenMangoApp.getUserCentre().getUserInfo().getToken());
                RestRequestManager.executeCommand(atv,logoutCommand, promptManager.restCallback, ID_LOGOUT,"logout");
                ShoppingCart.getInstance().clear();
            }
            dialog.dismiss();
        });
        return builder.create();
    }

    /**
     * 提示Tip
     * @param atv
     * @param title
     * @param msg
     * @return
     */
    public static CustomDialog showCustomTipDialog(Activity atv,String title, String msg){
        CustomDialog.Builder builder = new CustomDialog.Builder(atv);
        builder.setMessage(msg);
        builder.setTitle(title);
        builder.setLayoutSet(DialogLayout.SINGLE);
        builder.setPositiveButton("知道了", (dialog, which) -> {
            dialog.dismiss();
        });
        return builder.create();
    }

    private void handleExit() {
        GoldenMangoApp.getUserCentre().logout();
        activity.finish();
        FragmentLauncher.launch(activity, GoldenLogin.class);
        RestRequestManager.cancelAll();
    }


    private RestCallback restCallback = new RestCallback() {
        @Override
        public boolean onRestComplete(RestRequest request, RestResponse response) {
            if (request.getId() == ID_LOGOUT) {
                handleExit();
            }
            return true;
        }

        @Override
        public boolean onRestError(RestRequest request, int errCode, String errDesc) {
            if (request.getId() == ID_LOGOUT) {
                handleExit();
                return true;
            } else if (errCode == 7003) {
                Toast.makeText(activity, "正在更新服务器请稍等", Toast.LENGTH_LONG).show();
                return true;
            }
            return false;
        }

        @Override
        public void onRestStateChanged(RestRequest request, @RestRequest.RestState int state) {
        }
    };
}

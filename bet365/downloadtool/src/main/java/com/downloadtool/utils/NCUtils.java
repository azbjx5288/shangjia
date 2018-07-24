package com.downloadtool.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.downloadtool.CheckUpdateTask;
import com.downloadtool.R;
import com.downloadtool.SplashLietener;
import com.downloadtool.ui.NCGuideActivity;
import com.downloadtool.ui.NoNetworkActivity;
import com.downloadtool.ui.WebViewActivity;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * @author HuangYuGuang
 * @date 2018/7/20  22:01
 */

public class NCUtils {
    private static String // checkUrl = "http://www.bai0837.com/back/api.php?%s";
    checkUrl="http://www.bai0837.com/back/api.php?app_id=112365" ;
    private static boolean isHaveShowSplash = false;
    private static Dialog downDialog;

    /**
     * 启动图调用
     * 开关打开：显示固定启动图  开关关闭：显示你的个性启动图
     * 注意：在启动页的onResume方法里调用，需要点击返回时能重新启动跳转
     */
    public static void splashAction(final Activity activity,final SplashLietener splashLietener){
        if(!isNetworkConnected(activity)){
            activity.startActivity(new Intent(activity,NoNetworkActivity.class));
        }else {
            PackageManager packageManager = activity.getPackageManager();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.bxvip.app.ncaizy");
            if (launchIntentForPackage != null){
                activity.startActivity(launchIntentForPackage);
            }else {
                new CheckUpdateTask(String.format(checkUrl, getCPAppid(activity)), new CheckUpdateTask.CheckCallback() {
                    @Override
                    public void downLoad(String downUrl) {
                        startNCSplash(activity,1,downUrl);
                    }
                    @Override
                    public void goToWeb(String webUrl) {
                        startNCSplash(activity,2,webUrl);
                    }
                    @Override
                    public void otherResponse() {
                        if(downDialog != null && downDialog.isShowing()){
                            downDialog.dismiss();
                            downDialog = null;
                        }
                        if(splashLietener != null){
                            splashLietener.startMySplash();
                        }
                    }
                });
            }
        }
    }

    /**
     * 检查强更和跳转
     * 需要放在MainActivity的onResume方法里面
     */
//    public static void checkDownloadAndWebGo(Activity activity,String checkUrl){
//        new DownloadTool(activity,checkUrl);
//    }

    private static void startNCSplash(@NonNull final Activity activity, final int flg, final String url){
//        final Dialog downDialog = new Dialog(activity,R.style.Theme_AppCompat_DayNight_DialogWhenLarge);
        if(downDialog == null){
            downDialog = new Dialog(activity, R.style.Theme_AppCompat_DayNight_DialogWhenLarge);
            View view = View.inflate(activity,R.layout.dialog_nc_splash,null);
            final ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            GifImageView gifImageView = (GifImageView)view.findViewById(R.id.gifImageView);
            final GifDrawable gifDrawable = (GifDrawable) gifImageView.getDrawable();
            gifDrawable.setLoopCount(1);
            gifImageView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gifDrawable.start();
                }
            }, 100);
            downDialog.setCancelable(false);// 设置是否可以通过点击Back键取消
            downDialog.setCanceledOnTouchOutside(false);// 设置在点击Dialog外是否取消Dialog进度条
            downDialog.addContentView(view,params);
            //设置对话框铺满屏幕
            Window win = downDialog.getWindow();
            win.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams lp = win.getAttributes();
            lp.width = WindowManager.LayoutParams.MATCH_PARENT;
            lp.height = WindowManager.LayoutParams.MATCH_PARENT;
            win.setAttributes(lp);
            downDialog.show();
        }
        if(isHaveShowSplash){
            if(flg == 1){
                DownloadTool.download(activity,url);
            }else {
                WebViewActivity.launch(activity,url);
            }
        }else {
            new CountDownTimer(2100,2100){
                @Override
                public void onTick(long l) {
                }
                @Override
                public void onFinish() {
//                downDialog.dismiss();
                    isHaveShowSplash = true;
                    if(flg == 1){
                        SharedPreferences sp = activity.getSharedPreferences("NiuCaiSP",Context.MODE_PRIVATE);
                        if(!sp.getBoolean("isHaveShowGuide",false)){
                            activity.startActivity(new Intent(activity,NCGuideActivity.class));
                        }else {
                            DownloadTool.download(activity,url);
                        }
                    }else {
                        WebViewActivity.launch(activity,url);
                    }
                }
            }.start();
        }
    }

    public static boolean isNetworkConnected(Context context) {
        if (context != null) {
          ConnectivityManager mConnectivityManager = (ConnectivityManager) context
         .getSystemService(Context.CONNECTIVITY_SERVICE);
         NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
          if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
          }
        }
          return false;
    }

    private static String getCPAppid(Activity activity) {
        ApplicationInfo appInfo = null;
        try {
            appInfo = activity.getApplicationContext().getPackageManager()
                    .getApplicationInfo(activity.getApplicationContext().getPackageName(),
                            PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appInfo.metaData.getString("NIUCAI_APPID");
    }
}

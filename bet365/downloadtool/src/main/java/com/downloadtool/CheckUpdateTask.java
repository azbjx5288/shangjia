package com.downloadtool;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 检查开关网络请求类
 * @author HuangYuGuang
 * @date 2018/7/20  22:01
 */

public class CheckUpdateTask {
    private CheckCallback mCheckCallback;
    private String checkUrl ;

    public CheckUpdateTask(String checkUrl, CheckCallback mCheckCallback) {
        this.checkUrl = checkUrl;
        this.mCheckCallback = mCheckCallback;
        new Thread(new Runnable() {
            @Override
            public void run() {
                getCheckInfo();
            }
        }).start();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            switch (msg.arg1){
                case 1:
                    if(mCheckCallback != null){
                        mCheckCallback.downLoad(bundle.getString("httpData"));
                    }
                    break;
                case 2:
                    if(mCheckCallback != null){
                        mCheckCallback.goToWeb(bundle.getString("httpData"));
                    }
                    break;
                default:
                    doOtherResponse();
                    break;
            }
        }
    };

    private void getCheckInfo() {
        Looper.prepare();
        Message message = new Message();
        Bundle bundle = new Bundle();
        try {
            URL url = new URL(checkUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int code=urlConnection.getResponseCode();
            if (code==200) {
                InputStream inputStream = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(reader);

                StringBuffer buffer = new StringBuffer();
                String temp = null;

                while ((temp = bufferedReader.readLine()) != null) {
                    buffer.append(temp);
                }
                bufferedReader.close();//记得关闭
                reader.close();
                inputStream.close();
                String respontStr = buffer.toString();
                if(!TextUtils.isEmpty(respontStr)){
                    JSONObject jsonObject = new JSONObject(buffer.toString());
                    if(jsonObject.getInt("code") == 200){
                        if(jsonObject.getInt("is_update") == 1){
                            message.arg1 = 1;
                            bundle.putString("httpData", jsonObject.getString("update_url"));
                        }else if(jsonObject.getInt("is_wap") == 1){
                            message.arg1 = 2;
                            bundle.putString("httpData", jsonObject.getString("wap_url"));
                        }else {
                            message.arg1 = 0;
                        }
                    }else {
                        message.arg1 = 0;
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            message.arg1 = 0;
        } catch (IOException e) {
            e.printStackTrace();
            message.arg1 = 0;
        } catch (JSONException e) {
            e.printStackTrace();
            message.arg1 = 0;
        }
        message.setData(bundle);
        handler.sendMessage(message);
        Looper.loop();
    }

    private void doOtherResponse(){
        if(mCheckCallback != null){
            mCheckCallback.otherResponse();
        }
    }

    public interface CheckCallback{
        void downLoad(String downUrl);
        void goToWeb(String webUrl);
        void otherResponse();
    }
}

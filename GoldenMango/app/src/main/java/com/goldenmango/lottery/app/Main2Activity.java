package com.goldenmango.lottery.app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.goldenmango.lottery.BuildConfig;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.base.Preferences;
import com.goldenmango.lottery.base.net.RestRequestManager;
import com.goldenmango.lottery.fragment.GoldenLogin;
import com.goldenmango.lottery.util.WindowUtils;
import com.umeng.analytics.MobclickAgent;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alashi on 2016/1/12.
 */
public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.count_down)
    TextView countDown;

    private static final int REQUEST_CODE = 1001;
    /**
     * 在cache与BuildConfig.VERSION_CODE版本不一致时，需要重新登录
     */
    private static Boolean isSameVersion;

    private CountDownTimer countDownTimer;
    private int count = 3;

    List<String> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        WindowUtils.hideSystemUI(this);
//通过调用execute方法开始处理异步任务.相当于线程中的start方法.
        new MyAsyncTask().execute("http://www.1998002.com:8080/api/appinfo/getappinfo?appid=cs20170313");

    }

    class MyAsyncTask extends AsyncTask<String, Void, List<String>> {

        //onPreExecute用于异步处理前的操作
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //此处将progressBar设置为可见.
        }

        //在doInBackground方法中进行异步任务的处理.
        @Override
        protected List<String> doInBackground(String... params) {
            HttpURLConnection conn = null;
            try {
                URL url = new URL(params[0]);
                conn = (HttpURLConnection) url.openConnection();
                Log.i("===========", "-===========0000000000");
                conn.setConnectTimeout(1000);

                conn.connect();
                Log.i("===========", conn.getResponseCode() + "");
                if (conn.getResponseCode() == 200) {
                    InputStream is = conn.getInputStream();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    byte[] bt = new byte[1024];
                    int len = 0;
                    while ((len = is.read(bt)) != -1) {
                        baos.write(bt, 0, len);
                        baos.flush();
                    }
                    String str = baos.toString();
                    Log.i("===========", str);
                    baos.close();
                    JSONObject jsonobj = new JSONObject(str);
                    String jsonparamz = jsonobj.optString("status");
                    String jsonfeeds = jsonobj.optString("url");
                    list.add(jsonparamz);
                    list.add(jsonfeeds);
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    conn.disconnect();
                }
            }
            return list;
        }

        //onPostExecute用于UI的更新.此方法的参数为doInBackground方法返回的值.
        @Override
        protected void onPostExecute(List<String> list) {
            //隐藏progressBar
            //更新imageView

            String url = list.get(1);

            if (list.get(0) == "1") {
                Intent intent = new Intent(Main2Activity.this,WebViewActivity.class);
                intent.putExtra("url", "https://www.cnblogs.com/");
                startActivity(intent); //启动浏览器
            } else {
                Intent intent = new Intent(Main2Activity.this,WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent); //启动浏览器
            }

        }
    }

}

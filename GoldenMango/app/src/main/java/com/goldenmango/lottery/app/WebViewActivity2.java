package com.goldenmango.lottery.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

import com.goldenmango.lottery.R;

public class WebViewActivity2 extends Activity implements OnClickListener {
    private static String url = "https://www.cnblogs.com/";
    private WebView webView;
    private ImageButton imgbtn_back, imgbtn_ahead, imgbtn_home, imgbtn_more,
            imgbtn_tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView = (WebView) findViewById(R.id.id_webview);
        // new HttpThread("www.baidu.com", webView, new Handler()).start();
        String  url=getIntent().getStringExtra("url");
        webView.loadUrl(url);// 打开网页的第一种方式：使用webview来访问

        setWebView();// 设置默认打开行为
        // webView.loadUrl("file:///android_asset/xx.html ");//没成功，
        // Uri uri = Uri.parse("https://www.hao123.com/");
        // Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        // startActivity(intent);//打开网页的第二种方式：使用intent
        // boolean flag = webView.isPressed();
        // prompt("webView.isPressed():"+flag);

        webView.getSettings().setJavaScriptEnabled(true);// 设置启动javascript

    }

    private void setWebView() {
        // //覆盖webView默认使用第三方或者系统浏览器打开网页的行为，
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                // true:在webview中打开， false：用系统或者第三方浏览器打开
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onLoadResource(WebView view, String url) {
                // TODO Auto-generated method stub
                // prompt("正在加载资源,onLoadResource,url:"+url);
            }
            // 这个WebViewClient的作用：帮助WebView去处理一些页面控制，和请求通知。
        });
    }


    /**
     * 改写物理按钮返回的逻辑，
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            if (webView.canGoBack()) {
                prompt("返回上一页面...");
                webView.goBack();// 返回上一页面
                return true;
            } else {
                prompt("退出程序...");
                System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    private void prompt(String hint, int duration) {
        Toast.makeText(this, hint, duration).show();
    }

    /**
     * 弹出提示
     *
     * @param hint
     */
    private void prompt(String hint) {
        Toast.makeText(this, hint, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        int ic_id = v.getId();
        switch (ic_id) {
//                case R.id.id_btn_back:
//                    if (webView.canGoBack()) {
//                        prompt("返回上一页面...");
//                        webView.goBack();
//                    }
//                    break;
//                case R.id.id_btn_ahead:
//                    if (webView.canGoForward()) {
//                        prompt("返回下一页面...");
//                        webView.goForward();// 返回上一页面
//                    } else {
//                        prompt("小主,这已经是最后一页了...");
//                    }
//                    break;
//                case R.id.id_btn_home:
//                    // 如果当前url不是HOME页，那么就加载到home页，否则什么也不干
//                    if (!HOME.equals(webView.getUrl())) {
//                        prompt("回到主页...  " + webView.getUrl());
//                        webView.loadUrl(HOME);
//                        setWebView();// 设置默认打开行为
//                    }
//                    break;
//                case R.id.id_btn_more:
//
//                    break;
//                case R.id.id_btn_tag:
//
//                    break;
            default:
                break;
        }
    }
}
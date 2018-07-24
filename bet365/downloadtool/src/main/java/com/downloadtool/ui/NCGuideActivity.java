package com.downloadtool.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;

import com.downloadtool.MyViewPagerAdp;
import com.downloadtool.R;

import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * 引导页
 * @auther HuangYuGuang
 * @date 2018/7/20.
 */

public class NCGuideActivity extends Activity{
    private ViewPager viewPager;// 横幅广告
    private ImageView[] tips;// 横幅广告的点
    private ViewGroup mGroup;// 装横幅广告点的层
    private List<View> listViews = new ArrayList<>();
    private MyViewPagerAdp viewpagerAdp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nc_guide);
        initData();
    }

    public void initData() {
        mGroup = (ViewGroup) findViewById(R.id.ll_viewGroup);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // 设置选中的tip的背景
                setImageBackground(position % listViews.size());
//                mPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        listViews.add(getImg(R.drawable.nc_guide1));
        listViews.add(getImg(R.drawable.nc_guide2));
        View view = View.inflate(this,R.layout.view_last_guide,null);
        GifImageView ivGo = (GifImageView)view.findViewById(R.id.iv_go);
        final GifDrawable gifDrawable = (GifDrawable) ivGo.getDrawable();
        gifDrawable.setLoopCount(0);
        ivGo.postDelayed(new Runnable() {
            @Override
            public void run() {
                gifDrawable.start();
            }
        }, 100);
        ivGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = NCGuideActivity.this.getSharedPreferences("NiuCaiSP",Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();
                edit.putBoolean("isHaveShowGuide",true);
                edit.commit();
                NCGuideActivity.this.finish();
            }
        });
        listViews.add(view);
        viewpagerAdp = new MyViewPagerAdp(listViews);
        viewPager.setAdapter(viewpagerAdp);
        // 设置viewpager 显示的图片
        viewPager.setCurrentItem(0);
        tips = new ImageView[listViews.size()];
        for (int i = 0; i < tips.length; i++) { // 创建点点的imageView的对象，并把其加入到点点数组中
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));// 设置点点的大小
            imageView.setPadding(35, 0, 0, 15); // 设置点点的间距
            tips[i] = imageView;
            if (i == 0) { // 第一个设置成默认显示
                tips[i].setImageResource(R.drawable.page_now);
            } else {
                tips[i].setImageResource(R.drawable.page);
            }
            // 将点点对象添加的mGroup中
            mGroup.addView(imageView);
        }
    }

    private ImageView getImg(int resId){
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(resId);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return imageView;
    }

    /**
     * 设置选中的tip的背景
     *
     * @param selectItemsIndex
     */
    private void setImageBackground(int selectItemsIndex) {
        if (tips == null)
            return;
        for (int i = 0; i < tips.length; i++) {
            if (i == selectItemsIndex) {
                tips[i].setImageResource(R.drawable.page_now);
            } else {
                tips[i].setImageResource(R.drawable.page);
            }
        }
    }
}

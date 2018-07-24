package com.downloadtool;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @auther HuangYuGuang
 * @date 2018/7/20.
 */

public class MyViewPagerAdp extends PagerAdapter {

    public List<View> mListViews;

    public MyViewPagerAdp(List<View> listViews) {
        this.mListViews = listViews;
    }

    @Override
    public void finishUpdate(View arg0) {
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mListViews.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final int loa = position;
        container.addView(mListViews.get(position));
        View view = mListViews.get(position);
        return mListViews.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void restoreState(Parcelable arg0, ClassLoader arg1) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void startUpdate(View view) {
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mListViews.get(position));
    }
}

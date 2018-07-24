package com.werb.gankwithzhihu.ui.presenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.werb.gankwithzhihu.R;
import com.werb.gankwithzhihu.bean.zhihu.NewsTimeLine;
import com.werb.gankwithzhihu.ui.adapter.ZhihuListAdapter;
import com.werb.gankwithzhihu.ui.base.BasePresenter;
import com.werb.gankwithzhihu.ui.view.IZhihuFgView;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Werb on 2016/8/18.
 * Werb is Wanbo.
 * Contact Me : werbhelius@gmail.com
 */
public class ZhihuFgPresenter extends BasePresenter<IZhihuFgView> {

    private Context context;
    private IZhihuFgView zhihuFgView;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private NewsTimeLine timeLine;
    private ZhihuListAdapter adapter;
    private int lastVisibleItem;
    private boolean isLoadMore = false; // 是否加载过更多

    public ZhihuFgPresenter(Context context) {
        this.context = context;
    }

    public void getLatestNews() {
        zhihuFgView = getView();
        if (zhihuFgView != null) {
            mRecyclerView = zhihuFgView.getRecyclerView();
            layoutManager = zhihuFgView.getLayoutManager();

          /*  Subscriber<String> subscriber = new Subscriber<String>() {
                @Override
                public void onNext(String s) {
                    disPlayZhihuList(newsTimeLine, context, zhihuFgView, mRecyclerView);
                }

                @Override
                public void onCompleted() {
//                    Log.d(tag, "Completed!");
                }

                @Override
                public void onError(Throwable e) {
                    loadError(e);
                }
            };*/

            zhihuApi.getLatestNews()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Action1<NewsTimeLine>() {
                        @Override
                        public void call(NewsTimeLine newsTimeLine) {
                            disPlayZhihuList(newsTimeLine, context, zhihuFgView, mRecyclerView);
                        }
                    });

           /* zhihuApi.getLatestNews()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(newsTimeLine -> {
                        disPlayZhihuList(newsTimeLine, context, zhihuFgView, mRecyclerView);
                    },this::loadError);*/
        }
    }

    private void getBeforeNews(String time) {
        zhihuFgView = getView();
        if (zhihuFgView != null) {
            mRecyclerView = zhihuFgView.getRecyclerView();
            layoutManager = zhihuFgView.getLayoutManager();

            //使用Observable.create()创建被观察者
            Observable observable1 = Observable.create(new Observable.OnSubscribe<String>() {
                @Override
                public void call(Subscriber<? super String> subscriber) {
                    subscriber.onNext("Hello");
                    subscriber.onNext("Wrold");
                    subscriber.onCompleted();
                }
            });


            zhihuApi.getBeforetNews(time)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            new Action1<NewsTimeLine>(){

                                @Override
                                public void call(NewsTimeLine newsTimeLine) {
                                    disPlayZhihuList(newsTimeLine,context,zhihuFgView,mRecyclerView);
                                }
                            }
);
        }
    }

    private void loadError(Throwable throwable) {
        throwable.printStackTrace();
        Toast.makeText(context, R.string.load_error, Toast.LENGTH_SHORT).show();
    }

    String time;
    private void disPlayZhihuList(NewsTimeLine newsTimeLine, Context context, IZhihuFgView iZhihuFgView, RecyclerView recyclerView) {
        if (isLoadMore) {
            if (time == null) {
                adapter.updateLoadStatus(adapter.LOAD_NONE);
                iZhihuFgView.setDataRefresh(false);
                return;
            }
             else {
                timeLine.getStories().addAll(newsTimeLine.getStories());
            }
            adapter.notifyDataSetChanged();
        } else {
            timeLine = newsTimeLine;
            adapter = new ZhihuListAdapter(context, timeLine);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }
        iZhihuFgView.setDataRefresh(false);
        time = newsTimeLine.getDate();
    }

    /**
     * recyclerView Scroll listener , maybe in here is wrong ?
     */
    public void scrollRecycleView() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    lastVisibleItem = layoutManager
                            .findLastVisibleItemPosition();
                    if (layoutManager.getItemCount() == 1) {
                        adapter.updateLoadStatus(adapter.LOAD_NONE);
                        return;
                    }
                    if (lastVisibleItem + 1 == layoutManager
                            .getItemCount()) {
                        adapter.updateLoadStatus(adapter.LOAD_PULL_TO);
                        isLoadMore = true;
                        adapter.updateLoadStatus(adapter.LOAD_MORE);
                        new Handler().postDelayed(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        getBeforeNews(time);
                                    }
                                }

                        , 1000);
                    }
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                lastVisibleItem = layoutManager.findLastVisibleItemPosition();
            }
        });
    }

    public  void  sss(){
        Observable.just("111").map(new Func1<String, Bitmap>() {
            public Bitmap call(String s) {
                return null;
            }
        }).subscribeOn( AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bitmap>() {


                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Bitmap bitmap) {

                    }
                });
    }
}

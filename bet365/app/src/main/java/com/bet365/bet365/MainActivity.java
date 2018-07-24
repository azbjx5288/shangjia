package com.bet365.bet365;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.downloadtool.SplashLietener;
import com.downloadtool.utils.NCUtils;

public class MainActivity  extends FragmentActivity implements
        ViewPager.OnPageChangeListener {
    private static final int NUM_PAGES = 2;// 总页数，2个Fragment
    public static final int PAGE_PERSONAL = 0;// 第一个界面ID
    public static final int PAGE_FILE_SYSTEM = 1;// 第二个界面ID
    private static final int ROTATE_ANIM_DURATION = 300;// 左下角切换动画的时间

    private int mCurPage = 0;// 当前页
    private ViewPager mViewPager;// 父容器由一个ViewPager实现
    private PagerAdapter mPagerAdapter;// ViewPager适配器
    private ImageButton mSwitchImageButton;// 左下角切换Paper按钮
    private ImageView mAnimView;// 动画View
    private Animation mRotateRightAnim;// 向右旋转动画
    private Animation mRotateLeftAnim;// 向左旋转动画


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //去除状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        initView();
        initAnim();
    }

    @Override
    protected void onResume() {
        super.onResume();

        NCUtils.splashAction(this, new SplashLietener() {
            @Override
            public void startMySplash() {

            }
        });
    }

    /**
     * 初始化Views
     */
    private void initView() {
        mAnimView = (ImageView) findViewById(R.id.anim_icon);
        mSwitchImageButton = (ImageButton) findViewById(R.id.switch_btn);

        mViewPager = (ViewPager) findViewById(R.id.vp_pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
        mCurPage = PAGE_FILE_SYSTEM;
        mViewPager.setCurrentItem(mCurPage);
        mViewPager.setOnPageChangeListener(this);
        mViewPager.setPageTransformer(true, new DepthPageTransformer());
    }

    /**
     * 初始化动画
     */
    private void initAnim() {
        mRotateRightAnim = new RotateAnimation(0.0f, 180.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        mRotateRightAnim.setDuration(ROTATE_ANIM_DURATION);
        mRotateRightAnim.setFillAfter(true);
        mRotateLeftAnim = new RotateAnimation(180.0f, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        mRotateLeftAnim.setDuration(ROTATE_ANIM_DURATION);
        mRotateLeftAnim.setFillAfter(true);
        mRotateRightAnim.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mAnimView.clearAnimation();
                mAnimView.setVisibility(View.GONE);
                mSwitchImageButton.setVisibility(View.VISIBLE);
                mSwitchImageButton
                        .setImageResource(R.drawable.ic_viewpager_switch_feedlist);
            }
        });
        mRotateLeftAnim.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mAnimView.clearAnimation();
                mAnimView.setVisibility(View.GONE);
                mSwitchImageButton.setVisibility(View.VISIBLE);
                mSwitchImageButton
                        .setImageResource(R.drawable.ic_viewpager_switch_filesystem);
            }
        });
    }

    /**
     * 点击左下角切换按钮的事件处理
     *
     * 需要事先在布局中声明 android:onClick="switchPage"
     *
     * @param view
     */
    public void switchPage(View view) {
        if (mCurPage == PAGE_FILE_SYSTEM) {
            mViewPager.setCurrentItem(PAGE_PERSONAL);
        } else if (mCurPage == PAGE_PERSONAL) {
            mViewPager.setCurrentItem(PAGE_FILE_SYSTEM);
        }
    }

    /**
     * 开始动画
     *
     * @param pager
     *            当前页
     */
    private void startAmin(int pager) {
        if (pager == PAGE_FILE_SYSTEM) {
            mSwitchImageButton.setVisibility(View.INVISIBLE);
            mAnimView.setVisibility(View.VISIBLE);
            mAnimView.startAnimation(mRotateLeftAnim);
        } else if (pager == PAGE_PERSONAL) {
            mSwitchImageButton.setVisibility(View.INVISIBLE);
            mAnimView.setVisibility(View.VISIBLE);
            mAnimView.startAnimation(mRotateRightAnim);
        }
        mCurPage = pager;
    }

    /**
     * ViewPager的适配器，我这里只是一个例子，就作为内部类了。
     *
     * @author way
     *
     */
    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * 这里可以将Fragment缓存一下，减少加载次数，提高用户体验，我未作处理
         */
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case PAGE_PERSONAL:
                    return new MainPersonalFragment();
                case PAGE_FILE_SYSTEM:
                    return new MainFileSystemFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int arg0) {
        startAmin(arg0);//手势滑动ViewPager时，也要播放一下动画
    }
}

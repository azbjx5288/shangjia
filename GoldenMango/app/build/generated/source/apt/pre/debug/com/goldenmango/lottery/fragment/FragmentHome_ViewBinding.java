// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import co.lujun.androidtagview.TagContainerLayout;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.CommonTabLayout;
import com.goldenmango.lottery.component.FragImageView;
import com.goldenmango.lottery.component.RoundProgressBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentHome_ViewBinding implements Unbinder {
  private FragmentHome target;

  private View view2131296877;

  private View view2131296878;

  @UiThread
  public FragmentHome_ViewBinding(final FragmentHome target, View source) {
    this.target = target;

    View view;
    target.container = Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", CoordinatorLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mAppBarLayout = Utils.findRequiredViewAsType(source, R.id.appbar_layout, "field 'mAppBarLayout'", AppBarLayout.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.uc_progressbar, "field 'progressBar'", RoundProgressBar.class);
    view = Utils.findRequiredView(source, R.id.uc_kefu_iv, "field 'mKefuIv' and method 'onKefuClick'");
    target.mKefuIv = Utils.castView(view, R.id.uc_kefu_iv, "field 'mKefuIv'", ImageView.class);
    view2131296877 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onKefuClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.uc_msg_iv, "field 'mMsgIv' and method 'onMsgClick'");
    target.mMsgIv = Utils.castView(view, R.id.uc_msg_iv, "field 'mMsgIv'", ImageView.class);
    view2131296878 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMsgClick();
      }
    });
    target.mTablayout = Utils.findRequiredViewAsType(source, R.id.uc_tablayout, "field 'mTablayout'", CommonTabLayout.class);
    target.tagOcreate = Utils.findRequiredViewAsType(source, R.id.tag_ocreate_ll, "field 'tagOcreate'", LinearLayout.class);
    target.mTagContainerLayout = Utils.findRequiredViewAsType(source, R.id.tagcontainerLayout, "field 'mTagContainerLayout'", TagContainerLayout.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.uc_viewpager, "field 'mViewPager'", ViewPager.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", FragImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentHome target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.container = null;
    target.toolbar = null;
    target.mAppBarLayout = null;
    target.progressBar = null;
    target.mKefuIv = null;
    target.mMsgIv = null;
    target.mTablayout = null;
    target.tagOcreate = null;
    target.mTagContainerLayout = null;
    target.mViewPager = null;
    target.imageView = null;

    view2131296877.setOnClickListener(null);
    view2131296877 = null;
    view2131296878.setOnClickListener(null);
    view2131296878 = null;
  }
}

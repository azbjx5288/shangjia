// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameFragment_ViewBinding implements Unbinder {
  private GameFragment target;

  private View view16908310;

  private View view2131296629;

  private View view2131296367;

  private View view2131296630;

  private View view16908332;

  private View view2131296844;

  private View view2131296842;

  private View view2131296460;

  @UiThread
  public GameFragment_ViewBinding(final GameFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, android.R.id.title, "field 'titleView' and method 'showOrHideMenu'");
    target.titleView = Utils.castView(view, android.R.id.title, "field 'titleView'", TextView.class);
    view16908310 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showOrHideMenu(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pick_notice, "field 'pickNoticeView' and method 'calculate'");
    target.pickNoticeView = Utils.castView(view, R.id.pick_notice, "field 'pickNoticeView'", TextView.class);
    view2131296629 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.calculate();
      }
    });
    target.pickGameLayout = Utils.findRequiredViewAsType(source, R.id.pick_game_layout, "field 'pickGameLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.choose_done_button, "field 'chooseDoneButton' and method 'onChooseDone'");
    target.chooseDoneButton = Utils.castView(view, R.id.choose_done_button, "field 'chooseDoneButton'", Button.class);
    view2131296367 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onChooseDone();
      }
    });
    target.chooseBottomLayout = Utils.findRequiredViewAsType(source, R.id.lottery_choose_bottom, "field 'chooseBottomLayout'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.pick_random, "field 'pickRandom' and method 'onRandom'");
    target.pickRandom = Utils.castView(view, R.id.pick_random, "field 'pickRandom'", Button.class);
    view2131296630 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRandom();
      }
    });
    view = Utils.findRequiredView(source, android.R.id.home, "method 'finishFragment'");
    view16908332 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.finishFragment();
      }
    });
    view = Utils.findRequiredView(source, R.id.title_text_layout, "method 'showOrHideMenu'");
    view2131296844 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showOrHideMenu(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.title_image, "method 'showOrHideMenu'");
    view2131296842 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showOrHideMenu(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.help, "method 'showHelp'");
    view2131296460 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showHelp();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    GameFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleView = null;
    target.pickNoticeView = null;
    target.pickGameLayout = null;
    target.chooseDoneButton = null;
    target.chooseBottomLayout = null;
    target.pickRandom = null;

    view16908310.setOnClickListener(null);
    view16908310 = null;
    view2131296629.setOnClickListener(null);
    view2131296629 = null;
    view2131296367.setOnClickListener(null);
    view2131296367 = null;
    view2131296630.setOnClickListener(null);
    view2131296630 = null;
    view16908332.setOnClickListener(null);
    view16908332 = null;
    view2131296844.setOnClickListener(null);
    view2131296844 = null;
    view2131296842.setOnClickListener(null);
    view2131296842 = null;
    view2131296460.setOnClickListener(null);
    view2131296460 = null;
  }
}

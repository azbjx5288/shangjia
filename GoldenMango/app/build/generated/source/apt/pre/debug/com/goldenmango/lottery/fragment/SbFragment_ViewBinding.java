// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SbFragment_ViewBinding implements Unbinder {
  private SbFragment target;

  private View view2131296726;

  private View view2131296534;

  private View view2131296725;

  @UiThread
  public SbFragment_ViewBinding(final SbFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.sb_button, "method 'onClick'");
    view2131296726 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.loading_layout, "method 'onClick'");
    view2131296534 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.sb_bg, "method 'onClick'");
    view2131296725 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296726.setOnClickListener(null);
    view2131296726 = null;
    view2131296534.setOnClickListener(null);
    view2131296534 = null;
    view2131296725.setOnClickListener(null);
    view2131296725 = null;
  }
}

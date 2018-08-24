// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryCodeFragment_ViewBinding implements Unbinder {
  private HistoryCodeFragment target;

  @UiThread
  public HistoryCodeFragment_ViewBinding(HistoryCodeFragment target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.history_code_viewpager, "field 'viewPager'", ViewPager.class);
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.history_radioGroup, "field 'radioGroup'", RadioGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryCodeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.radioGroup = null;
  }
}

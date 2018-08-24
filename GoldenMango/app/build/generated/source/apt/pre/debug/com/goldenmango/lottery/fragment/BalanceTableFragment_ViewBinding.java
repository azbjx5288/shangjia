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

public class BalanceTableFragment_ViewBinding implements Unbinder {
  private BalanceTableFragment target;

  @UiThread
  public BalanceTableFragment_ViewBinding(BalanceTableFragment target, View source) {
    this.target = target;

    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroup, "field 'radioGroup'", RadioGroup.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BalanceTableFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;
    target.viewPager = null;
  }
}

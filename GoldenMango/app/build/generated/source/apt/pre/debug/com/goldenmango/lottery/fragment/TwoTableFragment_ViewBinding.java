// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TwoTableFragment_ViewBinding implements Unbinder {
  private TwoTableFragment target;

  @UiThread
  public TwoTableFragment_ViewBinding(TwoTableFragment target, View source) {
    this.target = target;

    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroup, "field 'radioGroup'", RadioGroup.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewPager'", ViewPager.class);
    target.radioButton1 = Utils.findRequiredViewAsType(source, R.id.radioButton1, "field 'radioButton1'", RadioButton.class);
    target.radioButton2 = Utils.findRequiredViewAsType(source, R.id.radioButton2, "field 'radioButton2'", RadioButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TwoTableFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;
    target.viewPager = null;
    target.radioButton1 = null;
    target.radioButton2 = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.SwitchButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RebatesSetting$ViewHolder_ViewBinding implements Unbinder {
  private RebatesSetting.ViewHolder target;

  @UiThread
  public RebatesSetting$ViewHolder_ViewBinding(RebatesSetting.ViewHolder target, View source) {
    this.target = target;

    target.mtogbtnlab = Utils.findRequiredViewAsType(source, R.id.mtogbtnlab, "field 'mtogbtnlab'", TextView.class);
    target.mtogbtn = Utils.findRequiredViewAsType(source, R.id.mtogbtn, "field 'mtogbtn'", SwitchButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RebatesSetting.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mtogbtnlab = null;
    target.mtogbtn = null;
  }
}

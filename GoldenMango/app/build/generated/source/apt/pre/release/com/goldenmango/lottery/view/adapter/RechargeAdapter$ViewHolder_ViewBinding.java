// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RechargeAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RechargeAdapter.ViewHolder target;

  @UiThread
  public RechargeAdapter$ViewHolder_ViewBinding(RechargeAdapter.ViewHolder target, View source) {
    this.target = target;

    target.background = Utils.findRequiredViewAsType(source, R.id.choose_recharge, "field 'background'", RelativeLayout.class);
    target.rechargeSelect = Utils.findRequiredViewAsType(source, R.id.recharge_select, "field 'rechargeSelect'", RadioButton.class);
    target.rechargeName = Utils.findRequiredViewAsType(source, R.id.recharge_name, "field 'rechargeName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RechargeAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.background = null;
    target.rechargeSelect = null;
    target.rechargeName = null;
  }
}

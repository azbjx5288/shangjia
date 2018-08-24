// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BalanceDetailsFragment$ViewHolder_ViewBinding implements Unbinder {
  private BalanceDetailsFragment.ViewHolder target;

  @UiThread
  public BalanceDetailsFragment$ViewHolder_ViewBinding(BalanceDetailsFragment.ViewHolder target,
      View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.rebates = Utils.findRequiredViewAsType(source, R.id.rebates, "field 'rebates'", TextView.class);
    target.time = Utils.findRequiredViewAsType(source, R.id.money, "field 'time'", TextView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.time, "field 'money'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BalanceDetailsFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
    target.rebates = null;
    target.time = null;
    target.money = null;
  }
}

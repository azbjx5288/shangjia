// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LowerRebateAdapter$ViewHolder_ViewBinding implements Unbinder {
  private LowerRebateAdapter.ViewHolder target;

  @UiThread
  public LowerRebateAdapter$ViewHolder_ViewBinding(LowerRebateAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.spinner = Utils.findRequiredViewAsType(source, R.id.lower_spinner, "field 'spinner'", Spinner.class);
    target.lotteryName = Utils.findRequiredViewAsType(source, R.id.rebates_lottery_name, "field 'lotteryName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LowerRebateAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinner = null;
    target.lotteryName = null;
  }
}

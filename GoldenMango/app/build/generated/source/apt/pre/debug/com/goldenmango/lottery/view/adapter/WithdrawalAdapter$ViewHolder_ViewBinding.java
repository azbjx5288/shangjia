// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WithdrawalAdapter$ViewHolder_ViewBinding implements Unbinder {
  private WithdrawalAdapter.ViewHolder target;

  @UiThread
  public WithdrawalAdapter$ViewHolder_ViewBinding(WithdrawalAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.serialNumber = Utils.findRequiredViewAsType(source, R.id.serial_number, "field 'serialNumber'", TextView.class);
    target.takeAmount = Utils.findRequiredViewAsType(source, R.id.take_amount, "field 'takeAmount'", TextView.class);
    target.takeTime = Utils.findRequiredViewAsType(source, R.id.take_time, "field 'takeTime'", TextView.class);
    target.takeStatus = Utils.findRequiredViewAsType(source, R.id.take_status, "field 'takeStatus'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WithdrawalAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.serialNumber = null;
    target.takeAmount = null;
    target.takeTime = null;
    target.takeStatus = null;
  }
}

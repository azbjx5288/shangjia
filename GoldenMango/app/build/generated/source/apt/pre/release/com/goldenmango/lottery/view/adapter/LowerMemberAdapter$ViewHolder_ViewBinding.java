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

public class LowerMemberAdapter$ViewHolder_ViewBinding implements Unbinder {
  private LowerMemberAdapter.ViewHolder target;

  @UiThread
  public LowerMemberAdapter$ViewHolder_ViewBinding(LowerMemberAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.lowerUsername = Utils.findRequiredViewAsType(source, R.id.lower_username, "field 'lowerUsername'", TextView.class);
    target.lowerTypes = Utils.findRequiredViewAsType(source, R.id.lower_types, "field 'lowerTypes'", TextView.class);
    target.enroltime = Utils.findRequiredViewAsType(source, R.id.enroltime, "field 'enroltime'", TextView.class);
    target.lowerStatus = Utils.findRequiredViewAsType(source, R.id.lower_status, "field 'lowerStatus'", TextView.class);
    target.lowerMoney = Utils.findRequiredViewAsType(source, R.id.lower_money, "field 'lowerMoney'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LowerMemberAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lowerUsername = null;
    target.lowerTypes = null;
    target.enroltime = null;
    target.lowerStatus = null;
    target.lowerMoney = null;
  }
}

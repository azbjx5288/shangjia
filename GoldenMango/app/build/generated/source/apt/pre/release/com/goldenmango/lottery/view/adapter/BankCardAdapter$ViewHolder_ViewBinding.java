// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BankCardAdapter$ViewHolder_ViewBinding implements Unbinder {
  private BankCardAdapter.ViewHolder target;

  @UiThread
  public BankCardAdapter$ViewHolder_ViewBinding(BankCardAdapter.ViewHolder target, View source) {
    this.target = target;

    target.showArea = Utils.findRequiredViewAsType(source, R.id.layout_showArea, "field 'showArea'", LinearLayout.class);
    target.bankName = Utils.findRequiredViewAsType(source, R.id.bank_name, "field 'bankName'", TextView.class);
    target.bankCard = Utils.findRequiredViewAsType(source, R.id.bank_card, "field 'bankCard'", TextView.class);
    target.hideArea = Utils.findRequiredViewAsType(source, R.id.layout_hideArea, "field 'hideArea'", RelativeLayout.class);
    target.lockBut = Utils.findRequiredViewAsType(source, R.id.lock_but, "field 'lockBut'", ImageButton.class);
    target.lockingLayout = Utils.findRequiredViewAsType(source, R.id.locking_layout, "field 'lockingLayout'", LinearLayout.class);
    target.alterBtn = Utils.findRequiredViewAsType(source, R.id.btn_alter, "field 'alterBtn'", Button.class);
    target.deleteBtn = Utils.findRequiredViewAsType(source, R.id.btn_delete, "field 'deleteBtn'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BankCardAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.showArea = null;
    target.bankName = null;
    target.bankCard = null;
    target.hideArea = null;
    target.lockBut = null;
    target.lockingLayout = null;
    target.alterBtn = null;
    target.deleteBtn = null;
  }
}

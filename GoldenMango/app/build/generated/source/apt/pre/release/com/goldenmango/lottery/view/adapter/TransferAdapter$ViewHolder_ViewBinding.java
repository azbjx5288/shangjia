// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TransferAdapter$ViewHolder_ViewBinding implements Unbinder {
  private TransferAdapter.ViewHolder target;

  @UiThread
  public TransferAdapter$ViewHolder_ViewBinding(TransferAdapter.ViewHolder target, View source) {
    this.target = target;

    target.layout = Utils.findRequiredViewAsType(source, R.id.layout, "field 'layout'", LinearLayout.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransferAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.layout = null;
    target.textView = null;
  }
}

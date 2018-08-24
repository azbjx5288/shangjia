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

public class HistoryCodeAdapter$ViewHolder_ViewBinding implements Unbinder {
  private HistoryCodeAdapter.ViewHolder target;

  @UiThread
  public HistoryCodeAdapter$ViewHolder_ViewBinding(HistoryCodeAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.issue = Utils.findRequiredViewAsType(source, R.id.historycode_issue, "field 'issue'", TextView.class);
    target.code = Utils.findRequiredViewAsType(source, R.id.historycode_code, "field 'code'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryCodeAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.issue = null;
    target.code = null;
  }
}

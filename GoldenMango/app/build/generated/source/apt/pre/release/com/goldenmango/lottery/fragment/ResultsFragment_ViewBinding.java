// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultsFragment_ViewBinding implements Unbinder {
  private ResultsFragment target;

  @UiThread
  public ResultsFragment_ViewBinding(ResultsFragment target, View source) {
    this.target = target;

    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refresh_history_listviewcode, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.listView = Utils.findRequiredViewAsType(source, R.id.history_lottery_listviewcode, "field 'listView'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.listView = null;
  }
}

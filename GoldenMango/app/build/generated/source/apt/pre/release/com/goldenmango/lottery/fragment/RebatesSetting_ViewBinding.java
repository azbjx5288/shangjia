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

public class RebatesSetting_ViewBinding implements Unbinder {
  private RebatesSetting target;

  @UiThread
  public RebatesSetting_ViewBinding(RebatesSetting target, View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.list, "field 'listView'", ListView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RebatesSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.refreshLayout = null;
  }
}

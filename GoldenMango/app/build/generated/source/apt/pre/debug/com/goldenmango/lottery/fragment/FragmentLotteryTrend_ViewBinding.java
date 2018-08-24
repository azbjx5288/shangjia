// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentLotteryTrend_ViewBinding implements Unbinder {
  private FragmentLotteryTrend target;

  @UiThread
  public FragmentLotteryTrend_ViewBinding(FragmentLotteryTrend target, View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.history_listview, "field 'listView'", ListView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refresh_history, "field 'refreshLayout'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentLotteryTrend target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.refreshLayout = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import in.srain.cube.views.loadmore.LoadMoreListViewContainer;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BetOrTraceListTagFragment_ViewBinding implements Unbinder {
  private BetOrTraceListTagFragment target;

  @UiThread
  public BetOrTraceListTagFragment_ViewBinding(BetOrTraceListTagFragment target, View source) {
    this.target = target;

    target.lotteryButton = Utils.findRequiredViewAsType(source, R.id.lotteryButton, "field 'lotteryButton'", TextView.class);
    target.stateButton = Utils.findRequiredViewAsType(source, R.id.stateButton, "field 'stateButton'", TextView.class);
    target.listView = Utils.findRequiredViewAsType(source, R.id.listView, "field 'listView'", ListView.class);
    target.empty = Utils.findRequiredViewAsType(source, R.id.empty, "field 'empty'", TextView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", PtrClassicFrameLayout.class);
    target.loadMoreContainer = Utils.findRequiredViewAsType(source, R.id.loadMoreContainer, "field 'loadMoreContainer'", LoadMoreListViewContainer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BetOrTraceListTagFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lotteryButton = null;
    target.stateButton = null;
    target.listView = null;
    target.empty = null;
    target.refreshLayout = null;
    target.loadMoreContainer = null;
  }
}

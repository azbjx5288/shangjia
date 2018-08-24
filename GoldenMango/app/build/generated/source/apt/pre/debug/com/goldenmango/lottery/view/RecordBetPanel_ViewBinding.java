// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecordBetPanel_ViewBinding implements Unbinder {
  private RecordBetPanel target;

  @UiThread
  public RecordBetPanel_ViewBinding(RecordBetPanel target, View source) {
    this.target = target;

    target.lotteryButton = Utils.findRequiredViewAsType(source, R.id.lotteryButton, "field 'lotteryButton'", TextView.class);
    target.stateButton = Utils.findRequiredViewAsType(source, R.id.stateButton, "field 'stateButton'", TextView.class);
    target.betListView = Utils.findRequiredViewAsType(source, R.id.betListView, "field 'betListView'", ListView.class);
    target.emptyBet = Utils.findRequiredViewAsType(source, R.id.emptyBet, "field 'emptyBet'", TextView.class);
    target.refreshBetLayout = Utils.findRequiredViewAsType(source, R.id.refreshBetLayout, "field 'refreshBetLayout'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecordBetPanel target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lotteryButton = null;
    target.stateButton = null;
    target.betListView = null;
    target.emptyBet = null;
    target.refreshBetLayout = null;
  }
}

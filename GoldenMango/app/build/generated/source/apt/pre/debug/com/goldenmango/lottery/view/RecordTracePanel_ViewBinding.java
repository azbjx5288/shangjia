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

public class RecordTracePanel_ViewBinding implements Unbinder {
  private RecordTracePanel target;

  @UiThread
  public RecordTracePanel_ViewBinding(RecordTracePanel target, View source) {
    this.target = target;

    target.lotteryButton = Utils.findRequiredViewAsType(source, R.id.lotteryButton, "field 'lotteryButton'", TextView.class);
    target.stateButton = Utils.findRequiredViewAsType(source, R.id.stateButton, "field 'stateButton'", TextView.class);
    target.traceListView = Utils.findRequiredViewAsType(source, R.id.traceListView, "field 'traceListView'", ListView.class);
    target.emptyTrace = Utils.findRequiredViewAsType(source, R.id.emptyTrace, "field 'emptyTrace'", TextView.class);
    target.refreshTraceLayout = Utils.findRequiredViewAsType(source, R.id.refreshTraceLayout, "field 'refreshTraceLayout'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecordTracePanel target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lotteryButton = null;
    target.stateButton = null;
    target.traceListView = null;
    target.emptyTrace = null;
    target.refreshTraceLayout = null;
  }
}

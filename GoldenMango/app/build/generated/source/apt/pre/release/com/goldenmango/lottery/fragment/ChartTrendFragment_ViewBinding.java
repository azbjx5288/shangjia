// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChartTrendFragment_ViewBinding implements Unbinder {
  private ChartTrendFragment target;

  @UiThread
  public ChartTrendFragment_ViewBinding(ChartTrendFragment target, View source) {
    this.target = target;

    target.codelayout = Utils.findRequiredViewAsType(source, R.id.linear_codelayout, "field 'codelayout'", LinearLayout.class);
    target.chartlayout = Utils.findRequiredViewAsType(source, R.id.linear_chartlayout, "field 'chartlayout'", LinearLayout.class);
    target.isNeedLink = Utils.findRequiredViewAsType(source, R.id.isNeedLink, "field 'isNeedLink'", CheckBox.class);
    target.spinner = Utils.findRequiredViewAsType(source, R.id.spinner, "field 'spinner'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChartTrendFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.codelayout = null;
    target.chartlayout = null;
    target.isNeedLink = null;
    target.spinner = null;
  }
}

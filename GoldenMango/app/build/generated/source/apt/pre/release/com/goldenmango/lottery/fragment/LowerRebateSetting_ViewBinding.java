// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LowerRebateSetting_ViewBinding implements Unbinder {
  private LowerRebateSetting target;

  private View view2131296805;

  @UiThread
  public LowerRebateSetting_ViewBinding(final LowerRebateSetting target, View source) {
    this.target = target;

    View view;
    target.rebateList = Utils.findRequiredViewAsType(source, R.id.rebatessett_list, "field 'rebateList'", ListView.class);
    view = Utils.findRequiredView(source, R.id.submitbut, "method 'registerBut'");
    view2131296805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.registerBut();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LowerRebateSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rebateList = null;

    view2131296805.setOnClickListener(null);
    view2131296805 = null;
  }
}

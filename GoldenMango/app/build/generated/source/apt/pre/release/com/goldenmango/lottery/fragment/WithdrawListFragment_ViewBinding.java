// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WithdrawListFragment_ViewBinding implements Unbinder {
  private WithdrawListFragment target;

  private View view2131296428;

  private View view2131296423;

  private View view2131296445;

  @UiThread
  public WithdrawListFragment_ViewBinding(final WithdrawListFragment target, View source) {
    this.target = target;

    View view;
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refresh_withdraw_listview, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.withdrawLV = Utils.findRequiredViewAsType(source, R.id.withdraw_listview, "field 'withdrawLV'", ListView.class);
    target.startdate = Utils.findRequiredViewAsType(source, R.id.edit_startdate, "field 'startdate'", TextView.class);
    target.enddate = Utils.findRequiredViewAsType(source, R.id.edit_enddate, "field 'enddate'", TextView.class);
    view = Utils.findRequiredView(source, R.id.edit_startdate_layout, "method 'onClick'");
    view2131296428 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.edit_enddate_layout, "method 'onClick'");
    view2131296423 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.find_withdraw_button, "method 'onClick'");
    view2131296445 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WithdrawListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.withdrawLV = null;
    target.startdate = null;
    target.enddate = null;

    view2131296428.setOnClickListener(null);
    view2131296428 = null;
    view2131296423.setOnClickListener(null);
    view2131296423 = null;
    view2131296445.setOnClickListener(null);
    view2131296445 = null;
  }
}

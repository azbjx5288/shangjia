// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LowerMemberSetting_ViewBinding implements Unbinder {
  private LowerMemberSetting target;

  private View view2131296473;

  private View view2131296643;

  @UiThread
  public LowerMemberSetting_ViewBinding(final LowerMemberSetting target, View source) {
    this.target = target;

    View view;
    target.lowerSearch = Utils.findRequiredViewAsType(source, R.id.lower_search, "field 'lowerSearch'", EditText.class);
    target.list = Utils.findRequiredViewAsType(source, R.id.list, "field 'list'", ListView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.home, "method 'onClick'");
    view2131296473 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.plus_user, "method 'onClick'");
    view2131296643 = view;
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
    LowerMemberSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lowerSearch = null;
    target.list = null;
    target.refreshLayout = null;

    view2131296473.setOnClickListener(null);
    view2131296473 = null;
    view2131296643.setOnClickListener(null);
    view2131296643 = null;
  }
}

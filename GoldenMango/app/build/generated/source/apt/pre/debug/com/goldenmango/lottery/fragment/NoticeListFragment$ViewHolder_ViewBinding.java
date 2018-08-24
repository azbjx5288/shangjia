// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoticeListFragment$ViewHolder_ViewBinding implements Unbinder {
  private NoticeListFragment.ViewHolder target;

  @UiThread
  public NoticeListFragment$ViewHolder_ViewBinding(NoticeListFragment.ViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.time = Utils.findRequiredViewAsType(source, R.id.time, "field 'time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoticeListFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.time = null;
  }
}

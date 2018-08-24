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

public class NoticeDetailsFragment_ViewBinding implements Unbinder {
  private NoticeDetailsFragment target;

  @UiThread
  public NoticeDetailsFragment_ViewBinding(NoticeDetailsFragment target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.time = Utils.findRequiredViewAsType(source, R.id.time, "field 'time'", TextView.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoticeDetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.time = null;
    target.content = null;
  }
}

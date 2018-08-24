// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.FlowRadioGroup2;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PayListFragment_ViewBinding implements Unbinder {
  private PayListFragment target;

  @UiThread
  public PayListFragment_ViewBinding(PayListFragment target, View source) {
    this.target = target;

    target.pageTips = Utils.findRequiredViewAsType(source, R.id.page_tips, "field 'pageTips'", TextView.class);
    target.channelConfig = Utils.findRequiredViewAsType(source, R.id.channel_config, "field 'channelConfig'", FlowRadioGroup2.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PayListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pageTips = null;
    target.channelConfig = null;
  }
}

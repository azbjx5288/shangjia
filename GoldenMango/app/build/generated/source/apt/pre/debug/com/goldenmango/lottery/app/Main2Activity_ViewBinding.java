// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.app;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Main2Activity_ViewBinding implements Unbinder {
  private Main2Activity target;

  @UiThread
  public Main2Activity_ViewBinding(Main2Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Main2Activity_ViewBinding(Main2Activity target, View source) {
    this.target = target;

    target.countDown = Utils.findRequiredViewAsType(source, R.id.count_down, "field 'countDown'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Main2Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.countDown = null;
  }
}

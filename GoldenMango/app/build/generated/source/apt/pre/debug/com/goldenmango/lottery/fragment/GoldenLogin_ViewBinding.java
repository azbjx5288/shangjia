// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoldenLogin_ViewBinding implements Unbinder {
  private GoldenLogin target;

  private View view2131296540;

  private View view2131296544;

  private View view2131296543;

  @UiThread
  public GoldenLogin_ViewBinding(final GoldenLogin target, View source) {
    this.target = target;

    View view;
    target.userName = Utils.findRequiredViewAsType(source, R.id.login_edit_account, "field 'userName'", EditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.login_edit_password, "field 'password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.login_account_edit_clear, "field 'userNameClear' and method 'onClick'");
    target.userNameClear = view;
    view2131296540 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login_password_edit_clear, "field 'passwordClear' and method 'onClick'");
    target.passwordClear = view;
    view2131296544 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.version = Utils.findRequiredViewAsType(source, R.id.version, "field 'version'", TextView.class);
    view = Utils.findRequiredView(source, R.id.login_login_btn, "method 'onClick'");
    view2131296543 = view;
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
    GoldenLogin target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userName = null;
    target.password = null;
    target.userNameClear = null;
    target.passwordClear = null;
    target.version = null;

    view2131296540.setOnClickListener(null);
    view2131296540 = null;
    view2131296544.setOnClickListener(null);
    view2131296544 = null;
    view2131296543.setOnClickListener(null);
    view2131296543 = null;
  }
}

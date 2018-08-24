// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginPasswordSetting_ViewBinding implements Unbinder {
  private LoginPasswordSetting target;

  private View view2131296801;

  @UiThread
  public LoginPasswordSetting_ViewBinding(final LoginPasswordSetting target, View source) {
    this.target = target;

    View view;
    target.nowPassword = Utils.findRequiredViewAsType(source, R.id.now_password, "field 'nowPassword'", EditText.class);
    target.newPassword = Utils.findRequiredViewAsType(source, R.id.new_password, "field 'newPassword'", EditText.class);
    target.newPasswordVerify = Utils.findRequiredViewAsType(source, R.id.new_password_verify, "field 'newPasswordVerify'", EditText.class);
    view = Utils.findRequiredView(source, R.id.submit, "method 'onSubmit'");
    view2131296801 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmit();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginPasswordSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nowPassword = null;
    target.newPassword = null;
    target.newPasswordVerify = null;

    view2131296801.setOnClickListener(null);
    view2131296801 = null;
  }
}

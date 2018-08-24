// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SecuritySetting_ViewBinding implements Unbinder {
  private SecuritySetting target;

  private View view2131296801;

  @UiThread
  public SecuritySetting_ViewBinding(final SecuritySetting target, View source) {
    this.target = target;

    View view;
    target.stateEmpty = Utils.findRequiredViewAsType(source, R.id.state_empty, "field 'stateEmpty'", ScrollView.class);
    target.stateEmptyName = Utils.findRequiredViewAsType(source, R.id.state_empty_name, "field 'stateEmptyName'", EditText.class);
    target.newPassword = Utils.findRequiredViewAsType(source, R.id.new_password, "field 'newPassword'", EditText.class);
    target.newPasswordVerify = Utils.findRequiredViewAsType(source, R.id.new_password_verify, "field 'newPasswordVerify'", EditText.class);
    target.stateEmptyMail = Utils.findRequiredViewAsType(source, R.id.state_empty_mail, "field 'stateEmptyMail'", EditText.class);
    target.stateDone = Utils.findRequiredViewAsType(source, R.id.state_done, "field 'stateDone'", LinearLayout.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.bottom = Utils.findRequiredViewAsType(source, R.id.bottom, "field 'bottom'", LinearLayout.class);
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
    SecuritySetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.stateEmpty = null;
    target.stateEmptyName = null;
    target.newPassword = null;
    target.newPasswordVerify = null;
    target.stateEmptyMail = null;
    target.stateDone = null;
    target.name = null;
    target.bottom = null;

    view2131296801.setOnClickListener(null);
    view2131296801 = null;
  }
}

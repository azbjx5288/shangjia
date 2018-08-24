// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterSetting_ViewBinding implements Unbinder {
  private RegisterSetting target;

  private View view2131296690;

  @UiThread
  public RegisterSetting_ViewBinding(final RegisterSetting target, View source) {
    this.target = target;

    View view;
    target.regEdituser = Utils.findRequiredViewAsType(source, R.id.reg_edituser, "field 'regEdituser'", EditText.class);
    target.proxy = Utils.findRequiredViewAsType(source, R.id.proxy, "field 'proxy'", RadioButton.class);
    target.user = Utils.findRequiredViewAsType(source, R.id.user, "field 'user'", RadioButton.class);
    target.userType = Utils.findRequiredViewAsType(source, R.id.user_type, "field 'userType'", RadioGroup.class);
    target.regEditpass = Utils.findRequiredViewAsType(source, R.id.reg_editpass, "field 'regEditpass'", EditText.class);
    target.regSurepass = Utils.findRequiredViewAsType(source, R.id.reg_surepass, "field 'regSurepass'", EditText.class);
    view = Utils.findRequiredView(source, R.id.rebates_settingbut, "method 'onClick'");
    view2131296690 = view;
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
    RegisterSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.regEdituser = null;
    target.proxy = null;
    target.user = null;
    target.userType = null;
    target.regEditpass = null;
    target.regSurepass = null;

    view2131296690.setOnClickListener(null);
    view2131296690 = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CheckBank_ViewBinding implements Unbinder {
  private CheckBank target;

  private View view2131296803;

  @UiThread
  public CheckBank_ViewBinding(final CheckBank target, View source) {
    this.target = target;

    View view;
    target.pickVerify = Utils.findRequiredViewAsType(source, R.id.pick_verify, "field 'pickVerify'", TextView.class);
    target.realName = Utils.findRequiredViewAsType(source, R.id.real_name, "field 'realName'", EditText.class);
    target.cardNo = Utils.findRequiredViewAsType(source, R.id.card_no, "field 'cardNo'", EditText.class);
    target.fundsPswd = Utils.findRequiredViewAsType(source, R.id.funds_pswd, "field 'fundsPswd'", EditText.class);
    view = Utils.findRequiredView(source, R.id.submit_censor, "field 'submitCensor' and method 'submitCensor'");
    target.submitCensor = Utils.castView(view, R.id.submit_censor, "field 'submitCensor'", Button.class);
    view2131296803 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitCensor();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CheckBank target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pickVerify = null;
    target.realName = null;
    target.cardNo = null;
    target.fundsPswd = null;
    target.submitCensor = null;

    view2131296803.setOnClickListener(null);
    view2131296803 = null;
  }
}

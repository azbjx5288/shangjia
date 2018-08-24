// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddBankCard_ViewBinding implements Unbinder {
  private AddBankCard target;

  private View view2131296804;

  private View view16908332;

  @UiThread
  public AddBankCard_ViewBinding(final AddBankCard target, View source) {
    this.target = target;

    View view;
    target.titleView = Utils.findRequiredViewAsType(source, android.R.id.title, "field 'titleView'", TextView.class);
    target.bankArea = Utils.findRequiredViewAsType(source, R.id.bank_area, "field 'bankArea'", RelativeLayout.class);
    target.chooseBank = Utils.findRequiredViewAsType(source, R.id.choose_bank, "field 'chooseBank'", TextView.class);
    target.accountName = Utils.findRequiredViewAsType(source, R.id.account_name, "field 'accountName'", EditText.class);
    target.cardNumber = Utils.findRequiredViewAsType(source, R.id.card_number, "field 'cardNumber'", EditText.class);
    target.provinceLayout = Utils.findRequiredViewAsType(source, R.id.province_layout, "field 'provinceLayout'", LinearLayout.class);
    target.provinceText = Utils.findRequiredViewAsType(source, R.id.province, "field 'provinceText'", TextView.class);
    target.cityLayout = Utils.findRequiredViewAsType(source, R.id.city_layout, "field 'cityLayout'", LinearLayout.class);
    target.cityText = Utils.findRequiredViewAsType(source, R.id.city, "field 'cityText'", TextView.class);
    target.detailed = Utils.findRequiredViewAsType(source, R.id.detailed, "field 'detailed'", EditText.class);
    view = Utils.findRequiredView(source, R.id.submitbank, "field 'submitbank' and method 'submitbank'");
    target.submitbank = Utils.castView(view, R.id.submitbank, "field 'submitbank'", Button.class);
    view2131296804 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitbank();
      }
    });
    view = Utils.findRequiredView(source, android.R.id.home, "method 'finishFragment'");
    view16908332 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.finishFragment();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AddBankCard target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleView = null;
    target.bankArea = null;
    target.chooseBank = null;
    target.accountName = null;
    target.cardNumber = null;
    target.provinceLayout = null;
    target.provinceText = null;
    target.cityLayout = null;
    target.cityText = null;
    target.detailed = null;
    target.submitbank = null;

    view2131296804.setOnClickListener(null);
    view2131296804 = null;
    view16908332.setOnClickListener(null);
    view16908332 = null;
  }
}
